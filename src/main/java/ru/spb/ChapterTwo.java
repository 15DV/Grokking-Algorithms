package ru.spb;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ChapterTwo {

    public void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, findIndexOfMinElement(array, i));
        }
    }

    private void swap(int[] array, int i, int indexOfMinElement) {
        var temp = array[i];
        array[i] = array[indexOfMinElement];
        array[indexOfMinElement] = temp;
    }

    private int findIndexOfMinElement(int[] array, int first) {
        var minInd = first;
        for (int i = first + 1; i < array.length; i++) {
            if (array[i] < array[minInd]) {
                minInd = i;
            }
        }
        return minInd;
    }
}
