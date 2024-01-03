public class FindSmallestLetterGreaterThanTarget {

    public char nextGreatestLetter(char[] letters, char target) {
        if (letters[letters.length - 1] < target){
            return letters[letters.length - 1];
        }
        int high = letters.length - 1;
        int low = 0;

        while (low <= high){
            int mid = low + (high - low) / 2;
            if (mid + 1 < letters.length){
                if (letters[mid] < target && letters[mid + 1] > target)
                    return letters[mid];
            }
            if (letters[mid] < target){
                low = mid + 1;
            } else{
                high = mid - 1;
            }

        }
        return letters[1];
    }

}
