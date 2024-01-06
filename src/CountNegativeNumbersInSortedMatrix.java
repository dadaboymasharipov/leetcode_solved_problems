/**
 * Easy
 */
public class CountNegativeNumbersInSortedMatrix {

    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] nums : grid) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < 0){
                    count += nums.length - i;
                    break;
                }
            }
        }
        return count;
    }


}
