package ru.spb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ChapterOneTest {

    private static Stream<Arguments> provideArraysSearchedElementExpectedIndex() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, 2, 1),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 2, 1),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 6, -1),
                Arguments.of(new int[]{1}, 2, -1),
                Arguments.of(new int[]{1, 2}, 1, 0),
                Arguments.of(new int[]{3}, 3, 0),
                Arguments.of(new int[]{1, 2, 3}, 2, 1),
                Arguments.of(new int[]{}, 2, -1),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, -1, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArraysSearchedElementExpectedIndex")
    void shouldReturnIndexOfSearchedElement(int[] array, int searchedElement, int expectedIndex) {
        var actualIndex = ChapterOne.binarySearch(array, searchedElement);

        Assertions.assertEquals(expectedIndex, actualIndex);
    }

}