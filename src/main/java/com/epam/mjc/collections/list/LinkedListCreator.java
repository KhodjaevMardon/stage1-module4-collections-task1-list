package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> answer = new LinkedList<>();
        for (Integer num : sourceList) {
            if (num % 2 == 0) {
                answer.addLast(num);
            } else {
                answer.addFirst(num);
            }
        }

        return answer;
    }
}
