public class MinTimeToMakeRopeColorful {
    public int minCost(String colors, int[] neededTime) {
        int result = 0;
        int i = 0;
        int j = 1;

        while (j < colors.length()){
            if (colors.charAt(i) == colors.charAt(j)){
                if (neededTime[i] > neededTime[j]) {
                    result += neededTime[j];
                    j++;
                } else {
                    result += neededTime[i];
                    i = j++;
                }
            } else {
                i = j++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new MinTimeToMakeRopeColorful().minCost("bbbaaa", new int[]{4,9,3,8,8,9}));
    }
}
