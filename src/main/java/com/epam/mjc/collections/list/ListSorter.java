package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        long first = Long.parseLong(a),
                second = Long.parseLong(b),
                firstMod = Math.abs(first),
                secondMod = Math.abs(second);
        int result = Long.compare(firstMod, secondMod);

        return result == 0 ? Long.compare(first, second) : result;
    }
}
