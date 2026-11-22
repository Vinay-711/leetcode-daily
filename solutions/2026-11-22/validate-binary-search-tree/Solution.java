public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

    private boolean validate(TreeNode node, Long lower, Long upper) {
        if (node == null) return true;
        long val = node.val;
        if (lower != null && val <= lower) return false;
        if (upper != null && val >= upper) return false;
        // Right subtree must have values > val
        if (!validate(node.right, val, upper)) return false;
        // Left subtree must have values < val
        if (!validate(node.left, lower, val)) return false;
        return true;
    }
}