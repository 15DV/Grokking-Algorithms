package ru.spb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class ChapterFourPart1Test {

    private static Stream<Arguments> provideLists() {
        return Stream.of(
                Arguments.of(List.of(4, 3, 2, 1)),
                Arguments.of(List.of(4, 3)),
                Arguments.of(List.of(3, 4)),
                Arguments.of(List.of(-4, -3, -2, -1)),
                Arguments.of(List.of(-1, -2, -3, -4)),
                Arguments.of(List.of(-1, -2, 0, 1, 2)),
                Arguments.of(List.of(-1, 1)),
                Arguments.of(List.of(1, 1))
        );
    }

    @ParameterizedTest
    @MethodSource("provideLists")
    void shouldSumArrayElements(List<Integer> list) {
        var expectedSum = list.stream().mapToInt(Integer::intValue).sum();

        var actualSum = ChapterFourPart1.sum(list);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @ParameterizedTest
    @MethodSource("provideLists")
    void shouldCountElementsOfList(List<Integer> list) {
        var expectedSize = list.size();

        var actualSize = ChapterFourPart1.size(list);

        Assertions.assertEquals(expectedSize, actualSize);
    }

    @ParameterizedTest
    @MethodSource("provideLists")
    void shouldReturnMaxElementOfList(List<Integer> list) {
        var expectedMax = Collections.max(list);

        var actualMax = ChapterFourPart1.max(list);

        Assertions.assertEquals(expectedMax, actualMax);
    }
}