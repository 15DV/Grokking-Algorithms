package ru.spb;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ChapterThree {

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n greater than or equal to zero (0)");
        }

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
