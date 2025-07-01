package com.example;

public class FindTheOriginalTypedString {

    /**
     * 3330. Find the Original Typed String I
     * EASY
     * 0ms | beats 100%
     */
    public int possibleStringCount(String word) {
        var result = 1;
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i - 1))
                result++;
        }
        return result;
    }
}
