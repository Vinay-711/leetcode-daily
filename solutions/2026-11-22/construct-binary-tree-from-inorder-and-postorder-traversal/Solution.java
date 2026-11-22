import java.util.*;

/**
 * Definition for a binary tree node.
 */
class TreeNode {
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length == 0) return null;
        int n = inorder.length;
        Map<Integer, Integer> inorderIndex = new HashMap<>();
        for (int i = 0; i < n; i++) {
            inorderIndex.put(inorder[i], i);
        }
        return build(inorder, 0, n - 1, postorder, 0, n - 1, inorderIndex);
    }

    private TreeNode build(int[] inorder, int inStart, int inEnd,
                           int[] postorder, int postStart, int postEnd,
                           Map<Integer, Integer> inorderIndex) {
        if (inStart > inEnd || postStart > postEnd) return null;
        int rootVal = postorder[postEnd];
        TreeNode root = new TreeNode(rootVal);
        int inRootIdx = inorderIndex.get(rootVal);
        int leftSize = inRootIdx - inStart;
        root.left = build(inorder, inStart, inRootIdx - 1,
                          postorder, postStart, postStart + leftSize - 1,
                          inorderIndex);
        root.right = build(inorder, inRootIdx + 1, inEnd,
                           postorder, postStart + leftSize, postEnd - 1,
                           inorderIndex);
        return root;
    }
}