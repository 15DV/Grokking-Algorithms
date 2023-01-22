package ru.spb;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ChapterTwoTest {

    private static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}),
                Arguments.of(new int[]{4, 3, 2, 1}),
                Arguments.of(new int[]{2, 4, 1, 3}),
                Arguments.of(new int[]{2, -4, 1, 3}),
                Arguments.of(new int[]{1}),
                Arguments.of(new int[]{2, 1}),
                Arguments.of(new int[]{}),
                Arguments.of(new int[]{-1, -2, -3, -4}),
                Arguments.of(new int[]{1, 1, 1, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArrays")
    void shouldSortArray(int[] array) {
        ChapterTwo.selectionSort(array);

        Assertions.assertTrue(ArrayUtils.isSorted(array));
    }
}