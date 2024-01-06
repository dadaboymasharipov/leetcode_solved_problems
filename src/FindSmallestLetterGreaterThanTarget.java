public class FindSmallestLetterGreaterThanTarget {

    public char nextGreatestLetter(char[] letters, char target) {

        int high = letters.length;
        int low = 0;

        while (low < high){
            int mid = low + (high - low) / 2;

            if (letters[mid] > target){
                high = mid;
            } else{
                low = mid + 1;
            }
        }

        if (low >= letters.length)
            return letters[0];
        return letters[low];
    }

}
