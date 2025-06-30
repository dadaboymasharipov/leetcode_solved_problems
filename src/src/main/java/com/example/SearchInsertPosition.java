package com.example;

public class SearchInsertPosition {

    /**
     * Difficulty easy
     */
    public int searchInsert(int[] nums, int target) {
        if (nums[nums.length - 1] < target)
            return nums.length;
        int high = nums.length - 1;
        int low = 0;
        int position = 0;

        while (low <= high){
            int mid = low + (high - low) / 2;
            if (mid + 1 < nums.length){
                if (nums[mid] < target && nums[mid + 1] > target){
                    position = ++mid;
                }
            }
            if (nums[mid] == target){
                return mid;
            }
            if (nums[mid] > target){
                high -= 1;
            }else if (nums[mid] < target){
                low += 1;
            }

        }

        return position;
    }
}
