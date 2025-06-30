package com.example;


import java.util.ArrayList;
import java.util.List;


public class LongestSubstringWithoutRepeatingCharacters {

    /*
    3. Longest Substring Without Repeating Characters
    ----------------
    time:4ms
    beats:89.20%
    */


    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        List<Character> list = new ArrayList<>(s.length());

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (list.contains(c)) {
                max = Math.max(list.size(), max);

                for (int j = 0; j < list.size(); ) {
                    if (!list.get(j).equals(c)) {
                        list.remove(j);
                        continue;
                    }
                    list.remove(j);
                    break;
                }
            }
            list.add(c);
        }
        max = Math.max(list.size(), max);
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("uqinntq"));
    }
}
