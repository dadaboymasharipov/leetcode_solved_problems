import annotations.Solved;
import annotations.enums.Status;

import static annotations.enums.Status.EASY;

public class RemoveDuplicatesFromArray {

    /*
    26. Remove Duplicates from Sorted Array
    --------------------
    time: 1ms
    rating: 66.57%
     */

    @Solved(EASY)
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[index]) {
                continue;
            }
            if (index + 1 == i) {
                index++;
                continue;
            }
            nums[index + 1] = nums[i];
            index++;
        }
        return index+1;
    }
}
