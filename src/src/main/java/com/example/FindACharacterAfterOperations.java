package com.example;

public class FindACharacterAfterOperations {

    /**
     * 3304. Find the K-th Character in String Game I
     * EASY
     */
    public char kthCharacter(int k) {
        StringBuilder builder = extendWord(new StringBuilder("a"), k);
        return builder.charAt(k-1);
    }

    private StringBuilder extendWord(StringBuilder word, int k) {
        while (word.length() < k) {
            int length = word.length();
            for (int i = 0; i < length; i++) {
                char nextChar = (char) (word.charAt(i) + 1);
                if (nextChar > 122)
                word.append('a');
                else word.append(Character.valueOf(nextChar));
            }
        }
        return word;
    }


}
