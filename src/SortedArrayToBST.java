public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        return createTreeNode(nums, 0, nums.length - 1);
    }

    public TreeNode createTreeNode(int[] array, int left, int right) {
        if (left > right) {
            return null;
        }

        int middle = left + (right - left) / 2;
        TreeNode treeNode = new TreeNode(array[middle]);
        treeNode.left = createTreeNode(array, left, middle - 1);
        treeNode.right = createTreeNode(array, middle + 1, right);

        return treeNode;
    }

    public TreeNode sortedArrayToBST(int[] nums, boolean b) {
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }
        int midValue = nums.length / 2;
        int[] left = new int[midValue + 1];
        int[] right = new int[midValue];

        for (int i = 0; i < nums.length; i++) {
            if (i < midValue)
                left[i] = nums[i];
            else if (i > midValue) {
                right[i - 1 - midValue] = nums[i];
            }
        }
        TreeNode treeNode = new TreeNode(nums[midValue]);
        treeNode.left = sortedArrayToBST(left);
        treeNode.right = sortedArrayToBST(right);

        return treeNode;
    }
}
