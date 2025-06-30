package com.example;

public class AddBinary {

    public String addBinary(String a, String b) {

        int max = 0;
        int diff = 0;
        String maxString = "";
        String minString = "";

        if (a.length() > b.length()) {
            max = a.length();
            diff = a.length() - b.length();
            maxString = a;
            minString = b;
        } else {
            max = b.length();
            diff = b.length() - a.length();
            maxString = b;
            minString = a;
        }

        StringBuilder preResult = new StringBuilder();
        int reminder = 0;
        for (int i = max - 1; i >= 0; i--) {
            int i2 = i - diff;
            if (i2 >= 0) {
                int value = Character.getNumericValue(maxString.charAt(i)) + Character.getNumericValue(minString.charAt(i2)) + reminder;
                if (value == 0) {
                    preResult.append(0);
                    reminder = 0;
                } else if (value == 1) {
                    preResult.append(1);
                    reminder = 0;
                } else if (value == 2) {
                    preResult.append(0);
                    reminder = 1;
                } else {
                    preResult.append(1);
                    reminder = 1;
                }
            } else {
                int value = Character.getNumericValue(maxString.charAt(i)) + reminder;
                if (value == 0) {
                    preResult.append(0);
                    reminder = 0;
                } else if (value == 1) {
                    preResult.append(1);
                    reminder = 0;
                } else {
                    preResult.append(0);
                    reminder = 1;

                }
            }
        }
        if (reminder == 1)
            preResult.append(1);
        return new String(preResult.reverse());
    }


}