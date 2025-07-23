package com.example;

public class DeleteColumnsToMakeSorted {

    /**
     * 944. Delete Columns to Make Sorted
     * EASY
     */
    public int minDeletionSize(String[] strs) {
        if (strs.length <= 1) {
            return 0;
        }

        int removeColumnCount = 0;
        int wordLength = strs[0].length();
        for (int i = 0; i < wordLength; i++) {
            for (int j = 0; j < strs.length - 1; j++) {
                String current = strs[j];
                String next = strs[j + 1];
                if (current.charAt(i) > next.charAt(i)) {
                    removeColumnCount++;
                    break;
                }
            }
        }
        return removeColumnCount;
    }
}
