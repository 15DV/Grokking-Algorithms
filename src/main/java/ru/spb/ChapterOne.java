package ru.spb;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ChapterOne {

    public int binarySearch(int[] array, int element) {
        var low = 0;
        var high = array.length - 1;

        while (low <= high) {
            var mid = (high + low) / 2;
            if (element < array[mid]) {
                high = mid - 1;
            } else if (element > array[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
