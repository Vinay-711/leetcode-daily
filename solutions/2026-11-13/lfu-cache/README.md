# lfu-cache

[Original practice problem](https://leetcode.com/problems/lfu-cache/)

Date: 2026-11-13 (Asia/Kolkata). Status: **Accepted**. Platform: **LeetCode**.

## Approach

The LFU cache is implemented using a combination of HashMaps and Doubly Linked Lists to achieve O(1) average time complexity for both `get` and `put` operations. Each cache entry is represented by a `Node` object storing its key, value, and frequency. A `HashMap<Integer, Node> cache` maps keys to their corresponding `Node` objects for O(1) lookup. To handle frequency-based eviction and LRU tie-breaking, another `HashMap<Integer, DoublyLinkedList> freqMap` is used. This map stores a `DoublyLinkedList` for each frequency level, where each list contains all `Node`s currently having that frequency, ordered by recency (most recently used at the head, least recently used at the tail). A `minFrequency` variable tracks the smallest frequency present in the cache, enabling O(1) identification of the LFU group for eviction. When a node is accessed (get/put), its frequency is incremented, and it's moved from its old frequency list to the head of the new frequency list. If an old frequency list becomes empty and its frequency was `minFrequency`, `minFrequency` is updated. When the cache is full and a new item is inserted, the least recently used item from the `minFrequency` list is evicted.

## Verification

Solution generated in Java and verified on LeetCode by autonomous AI bot.
