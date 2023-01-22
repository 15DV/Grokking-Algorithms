package ru.spb;

import lombok.experimental.UtilityClass;

import java.util.List;

@UtilityClass
public class ChapterFourPart1 {

    public int max(List<Integer> list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        if (list.size() == 2) {
            return Integer.max(list.get(0), list.get(1));
        }
        int max = max(list.subList(1, list.size()));
        return Integer.max(max, list.get(0));
    }

    public int sum(List<Integer> list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        return list.get(0) + sum(list.subList(1, list.size()));
    }

    public int size(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        return 1 + size(list.subList(1, list.size()));
    }
}
