package ru.spb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

class ChapterThreeTest {

    private static Stream<Arguments> provideNumberAndFactorial() {
        return Stream.of(
                Arguments.of(0, 1),
                Arguments.of(1, 1),
                Arguments.of(2, 2),
                Arguments.of(3, 6),
                Arguments.of(4, 24),
                Arguments.of(5, 120),
                Arguments.of(6, 720)

        );
    }

    @ParameterizedTest
    @MethodSource(value = "provideNumberAndFactorial")
    void shouldCalculateFactorial(int n, int expectedResult) {
        var actual = ChapterThree.factorial(n);
        Assertions.assertEquals(expectedResult, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -2, -100})
    void shouldThrowException(int n) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> ChapterThree.factorial(n));
    }
}