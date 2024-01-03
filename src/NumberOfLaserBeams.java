public class NumberOfLaserBeams {

    public int numberOfBeams(String[] bank) {
        if (bank.length == 1) {
            return 0;
        }
        int[] numberOfBeams = new int[bank.length];
        int j = 0;
        for (String s : bank) {
            if (!s.contains("1")) {
                continue;
            }
            numberOfBeams[j] = countNumberOfOnes(s);
            j++;
        }
        int result = 0;

        for (int i = 0; i < numberOfBeams.length - 1; i++) {
            result += numberOfBeams[i] * numberOfBeams[i + 1];
            if (numberOfBeams[i + 1] == 0)
                break;
        }

        return result;
    }

    public int countNumberOfOnes(String s) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            count += ch - '0';
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new NumberOfLaserBeams().numberOfBeams(new String[]{
                "011001", "000000", "010100", "001000"
        }));
    }
}
