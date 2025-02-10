import annotations.Solved;

import java.util.List;

import static annotations.enums.Status.EASY;

public class ClearDigits {

    /*
    3174. Clear Digits
    --------------------
    time: 5ms
    rating: 11.79%
     */

    @Solved(EASY)
    public String clearDigits(String s) {
        List<Character> digits = List.of('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
        boolean hasDigit = false;
        StringBuilder buffer = new StringBuilder(s);
        for (int i = 0; i < buffer.length(); i++) {
            if (digits.contains(buffer.charAt(i))) {
                buffer.deleteCharAt(i);
                buffer.deleteCharAt(i - 1);
                hasDigit = true;
                break;
            }
        }
        String result = new String(buffer);
        if (hasDigit) {
            result = clearDigits(result);
        }
        return result;
    }

    public static void main(String[] args) {
        new ClearDigits().clearDigits("a8f");
    }
}
