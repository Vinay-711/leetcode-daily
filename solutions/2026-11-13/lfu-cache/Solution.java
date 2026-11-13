import java.util.HashMap;

class LFUCache {

    // Node class to store key, value, frequency, and pointers for DoublyLinkedList
    class Node {
        int key;
        int value;
        int frequency;
        Node prev;
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.frequency = 1; // Initial frequency is 1
        }
    }

    // DoublyLinkedList class to manage nodes for a specific frequency
    // It uses dummy head and tail nodes to simplify operations
    class DoublyLinkedList {
        Node head; // dummy head
        Node tail; // dummy tail
        int size;

        public DoublyLinkedList() {
            head = new Node(0, 0); // Dummy node, key and value don't matter
            tail = new Node(0, 0); // Dummy node, key and value don't matter
            head.next = tail;
            tail.prev = head;
            size = 0;
        }

        // Add node to the head (most recently used within this frequency list)
        public void addNode(Node node) {
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
            size++;
        }

        // Remove a specific node from the list
        public void removeNode(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            size--;
        }

        // Remove and return the tail node (least recently used within this frequency list)
        public Node removeTail() {
            if (size == 0) {
                return null;
            }
            Node nodeToRemove = tail.prev;
            removeNode(nodeToRemove); // This also decrements size
            return nodeToRemove;
        }

        public boolean isEmpty() {
            return size == 0;
        }
    }

    int capacity;
    int currentSize;
    int minFrequency; // The minimum frequency currently present in the cache
    HashMap<Integer, Node> cache; // Maps key to its Node object
    HashMap<Integer, DoublyLinkedList> freqMap; // Maps frequency to a DoublyLinkedList of Nodes

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.currentSize = 0;
        this.minFrequency = 0; // Will be 1 when the first item is added
        this.cache = new HashMap<>();
        this.freqMap = new HashMap<>();
    }

    // Helper method to update a node's frequency and move it to the correct list
    private void updateNode(Node node) {
        // Remove node from its current frequency list
        DoublyLinkedList oldList = freqMap.get(node.frequency);
        oldList.removeNode(node);

        // If the old list becomes empty and its frequency was minFrequency,
        // then minFrequency must be incremented. This is because all items
        // at minFrequency have now moved to minFrequency + 1.
        if (oldList.isEmpty() && node.frequency == minFrequency) {
            minFrequency++;
        }

        // Increment node's frequency
        node.frequency++;

        // Add node to the new frequency list. Create the list if it doesn't exist.
        DoublyLinkedList newList = freqMap.getOrDefault(node.frequency, new DoublyLinkedList());
        newList.addNode(node);
        freqMap.put(node.frequency, newList);
    }

    public int get(int key) {
        if (capacity == 0) { // Edge case: capacity 0
            return -1;
        }
        if (!cache.containsKey(key)) {
            return -1;
        }

        Node node = cache.get(key);
        updateNode(node); // Update frequency and move in lists
        return node.value;
    }

    public void put(int key, int value) {
        if (capacity == 0) { // Edge case: capacity 0
            return;
        }

        if (cache.containsKey(key)) {
            // Key exists, update value and frequency
            Node node = cache.get(key);
            node.value = value; // Update value
            updateNode(node); // Update frequency and move in lists
        } else {
            // Key does not exist
            if (currentSize == capacity) {
                // Cache is full, evict LFU (and LRU for tie-breaking)
                DoublyLinkedList lfuList = freqMap.get(minFrequency);
                Node nodeToRemove = lfuList.removeTail(); // Get LRU from minFrequency list
                cache.remove(nodeToRemove.key); // Remove from cache map
                currentSize--;

                // No need to explicitly check if lfuList is empty and update minFrequency here.
                // When a new node is added, its frequency is 1, so minFrequency will be reset to 1 below.
            }

            // Add new node
            Node newNode = new Node(key, value);
            cache.put(key, newNode);

            // Add to frequency 1 list. Create the list if it doesn't exist.
            DoublyLinkedList listFreq1 = freqMap.getOrDefault(1, new DoublyLinkedList());
            listFreq1.addNode(newNode);
            freqMap.put(1, listFreq1);

            minFrequency = 1; // New node always starts with frequency 1, so this is the new minimum
            currentSize++;
        }
    }
}