package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LongestPalindromicSubstring {

    /**
     * 5. Longest Palindromic Substring
     * MEDIUM
     */
    public String longestPalindrome(String s) {
        char[] array = s.toCharArray();

        HashMap<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            List<Integer> indexes = map.getOrDefault(array[i], new ArrayList<>());
            indexes.add(i);
            map.put(array[i], indexes);
        }
        return "";
    }
}
