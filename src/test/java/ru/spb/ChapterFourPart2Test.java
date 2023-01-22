package ru.spb;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ChapterFourPart2Test {

    private static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}),
                Arguments.of(new int[]{4, 2, 3, 1}),
                Arguments.of(new int[]{1, 2}),
                Arguments.of(new int[]{2, 1}),
                Arguments.of(new int[]{1, 1}),
                Arguments.of(new int[]{1}),
                Arguments.of(new int[]{}),
                Arguments.of(new int[]{5, 3, 4, 2, 7, 1, 8, 9, 6}),
                Arguments.of(new int[]{9, 6, 4, 2, 7, 1, 3, 5, 6})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArrays")
    void shouldSortArray(int[] array) {
        ChapterFourPart2.quickSort(array);

        Assertions.assertTrue(ArrayUtils.isSorted(array));
    }
}