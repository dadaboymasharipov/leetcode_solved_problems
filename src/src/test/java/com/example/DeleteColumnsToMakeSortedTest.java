package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeleteColumnsToMakeSortedTest {

    DeleteColumnsToMakeSorted deleteColumns = new DeleteColumnsToMakeSorted();

    @ParameterizedTest
    @MethodSource("testCases")
    public void test(String[] strs, int expected) {
        assertEquals(expected, deleteColumns.minDeletionSize(strs));
    }

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.arguments(new String[]{
                        "zyx", "wvu", "tsr"
                }, 3),
                Arguments.arguments(new String[]{
                        "cba","daf","ghi"
                }, 1)
        );
    }

}