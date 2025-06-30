package com.example;

import java.time.LocalDate;

public class DayOfYear {
    /**
     * 1154. Day of the Year
     * Difficulty: EASY
     */
    public static int dayOfYear(String date) {
        return LocalDate.parse(date).getDayOfYear();
    }
}
