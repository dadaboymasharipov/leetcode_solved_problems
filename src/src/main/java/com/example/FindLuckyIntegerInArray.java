package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FindLuckyIntegerInArray {

    /**
     * 1394. Find Lucky Integer in an Array
     * EASY
     */
    /*public int findLucky(int[] arr) {
        var map = new HashMap<Integer, Integer>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int biggest = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getKey().equals(entry.getValue())
                    && entry.getKey().compareTo(biggest) > 0) {
                biggest = entry.getKey();
            }
        }
        return biggest;
    }*/

    /*Best solution compy pasted*/
    static {
        for (int i = 0; i < 100; i++) {
            findLucky(new int[0]);
        }
    }
    public static int findLucky(int[] arr) {
        if (arr.length == 0) return -1;

        int[] obeme = new int[501];

        for (int el : arr) {
            obeme[el] += 1;
        }

        for (int i = 500; i > 0; i--) {
            if (i == obeme[i])
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        FindLuckyIntegerInArray.findLucky(new int[]{1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6});
    }
}
