import java.util.List;

public class HalvesAreAlike {


    public boolean halvesAreAlike(String s) {
        String firstHalf = s.substring(0, s.length() / 2);
        String secondHalf = s.substring(s.length() / 2);

        return countVowels(firstHalf) == countVowels(secondHalf);
    }

    public int countVowels(String string) {
        int count = 0;
        String vowels = "AEIOUaeiou";

        for (char ch : string.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}
