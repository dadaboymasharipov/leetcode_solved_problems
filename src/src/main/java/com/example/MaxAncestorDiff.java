package com.example;

/**
 * Difficulty Medium
 */
public class MaxAncestorDiff {

    int diff = 0;

    public int maxAncestorDiff(TreeNode root) {
        calculateDiff(root);
        return diff;
    }

    public int[] calculateDiff(TreeNode root) {
        if (root == null) {
            return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};
        }

        if (root.left == null && root.right == null) {
            return new int[]{root.val, root.val};
        }

        int[] left = calculateDiff(root.left);
        int[] right = calculateDiff(root.right);

        int min = Math.min(left[0], right[0]);
        int max = Math.max(left[1], right[1]);

        int currentDiff = Math.max(Math.abs(root.val - min), Math.abs(root.val - max));
        diff = Math.max(diff, currentDiff);

        min = Math.min(root.val, min);
        max = Math.max(root.val, max);
        return new int[]{min, max};
    }
}
