package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FindTheOriginalTypedStringTest {

    private final FindTheOriginalTypedString testClass = new FindTheOriginalTypedString();

    @ParameterizedTest
    @MethodSource("testCases")
    public void checkNumberOfOriginalStrings(String word, int expected) {
        assertEquals(expected, testClass.possibleStringCount(word));
    }

    private static Stream<Arguments> testCases() {
        return Stream.of(
                arguments("a", 1),
                arguments("aa", 2),
                arguments("aaaaaaaaaaaaa", 13),
                arguments("aabb", 3),
                arguments("aabbcc", 4),
                arguments("aaabbcc", 5),
                arguments("aabbbccc", 6),
                arguments("aaaaaayyyyyyyzzzzz", 16),
                arguments("aabbaabbaabb", 7)
        );
    }

}