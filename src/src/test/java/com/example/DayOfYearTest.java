package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class DayOfYearTest {

    @ParameterizedTest
    @MethodSource("testCases")
    public void testDayOfYear(String date, int expected){
        assertEquals(expected, DayOfYear.dayOfYear(date));
    }

    public static Stream<Arguments> testCases(){
        return Stream.of(
                arguments("2019-09-09", 252),
                arguments("2019-02-10", 41),
                arguments("1985-11-10", 314),
                arguments("1988-11-10", 315),
                arguments("1990-01-01", 1)
        );
    }
}