package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindACharacterAfterOperationsTest {

    private static FindACharacterAfterOperations find = new FindACharacterAfterOperations();
    private static String values = """
            abbcbccdbccdcddebccdcddecddedeefbccdcddecddedeefcddedeefdeefeffg
            """;

    @ParameterizedTest
    @MethodSource("testCases")
    void testKithCharacter(int k) {
        char actual = find.kthCharacter(k);
        int a = 10 >> 2;
        char expected = values.charAt(k - 1);
        String message = "Wrong answer expected: " + expected + " but found: " + actual;
        assertEquals(expected, actual, message);
    }



    static Stream<Arguments> testCases() {
        List<Integer> list = new ArrayList<>(64);
        for (int i = 1; i < 64; i++) {
            list.add(i);
        }
        return list.stream().map(Arguments::of);
    }
}