

/**
 * Easy
 */
public class MakeAllStringsEqual {
    public boolean makeEqual(String[] words) {
        int[] count = new int[26];
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                count[word.charAt(i) - 'a']++;
            }
        }
        for (int i : count) {
            if (i % words.length != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new MakeAllStringsEqual().makeEqual(new String[]{"aabc", "abc", "bc"}));
        System.out.println(new MakeAllStringsEqual().makeEqual(new String[]{"aabc", "abc", "bc", ""}));
        System.out.println(new MakeAllStringsEqual().makeEqual(new String[]{"aabc", "abc", "bcc"}));
        System.out.println(new MakeAllStringsEqual().makeEqual(new String[]{"aabc", "bc"}));
        System.out.println(new MakeAllStringsEqual().makeEqual(new String[]{"aaaa", "bbbb"}));
        System.out.println(new MakeAllStringsEqual().makeEqual(new String[]{"bbbbb", "aaaaa", "ccccc"}));
        System.out.println(new MakeAllStringsEqual().makeEqual(new String[]{"abs", "xyz", "hui"}));
    }
}
