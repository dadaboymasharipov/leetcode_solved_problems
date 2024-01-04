import java.util.HashMap;
import java.util.Map;

/**
 * Medium
 */
public class MinOperationsToEmptyArray {

    public int minOperations(int[] nums) {

        Map<Integer, Integer> hashmap = new HashMap<>();

        for (int num : nums) {
            if (!hashmap.containsKey(num))
                hashmap.put(num, 1);
            else {
                Integer integer = hashmap.get(num);
                hashmap.put(num, ++integer);
            }
        }

        int result = 0;

        for (Integer value : hashmap.values()) {
            if (value / 2 == 0){
                return -1;
            }
            if (value % 3 > 0){
                result += value / 3 + 1;
            } else {
                result += value / 3;
            }
        }

        return result;
    }
}
