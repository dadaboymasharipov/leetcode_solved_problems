import java.util.Arrays;

public class FindRotation {

    public boolean findRotation(int[][] mat, int[][] target) {
        int n = 1;
        while (n <= 4){
            if (Arrays.deepEquals(mat, target)){
                return true;
            } else {
                mat = rotateArray(mat);
                n++;
            }
        }
        return false;
    }

    public int[][] rotateArray(int[][] array) {
        int[][] result = new int[array.length][array.length];

        for (int i = 0; i < array.length; i++){
            int n = 0;
            for (int j = array.length - 1; j >= 0; j--){
                result[i][n] = array[j][i];
                n++;
            }
        }

        return result;
    }


}
