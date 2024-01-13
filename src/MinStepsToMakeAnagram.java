public class MinStepsToMakeAnagram {

    public int minSteps(String s, String t) {
        int[] count = new int[26];

        for (byte ch : s.getBytes()) {
            count[ch - 'a']++;
        }

        for (byte ch : t.getBytes()) {
            count[ch - 'a']--;
        }

        int result = 0;

        for (int i : count) {
                result += Math.abs(i);
        }

        return result / 2;

    }
}
