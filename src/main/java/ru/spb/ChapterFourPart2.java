package ru.spb;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ChapterFourPart2 {

    public void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int start, int end) {
        if (end - start < 1) {
            return;
        }

        var pivot = array[(start + end) / 2];
        var i = start;
        var j = end;

        while (i <= j) {

            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }
        }

        quickSort(array, start, j);
        quickSort(array, i, end);
    }

    private void swap(int[] array, int i, int j) {
        var temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
