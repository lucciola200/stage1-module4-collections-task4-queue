package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (String str : firstList) {
            queue.offer(str);
        }
        for (String str : secondList) {
            queue.offer(str);
        }

        return queue;
    }
}
