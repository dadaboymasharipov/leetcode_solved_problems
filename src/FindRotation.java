import java.util.Arrays;

public class FindRotation {

    public boolean findRotation(int[][] mat, int[][] target) {
        return Arrays.deepEquals(mat, target);
    }

    public static void main(String[] args) {

        int[][] array1 = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}
        };

        int[][] array2 = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}
        };

        System.out.println(new FindRotation().findRotation(array2, array1));
    }

    public int[][] rotateArray(int[][] array) {
        int[][] result = new int[array.length][array.length];

        int[] diagonal1 = new int[array.length];
        int[] diagonal2 = new int[array.length];

        for (int i = 0; i < array.length; i++){
            diagonal1[i] = array[i][i];
            diagonal2[i] = array[i][array.length - 1 - i];
        }


        return result;
    }
}
