package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        //First, both take turns adding two cards to the ArrayDeque<Integer>.
        arrayDeque.add(firstQueue.remove());
        arrayDeque.add(firstQueue.remove());
        arrayDeque.add(secondQueue.remove());
        arrayDeque.add(secondQueue.remove());


        // Then, with each move, the player:
        // takes the top card from the ArrayDeque<Integer> and adds this card to the end of his Queue<Integer>
        // then puts two cards from the beginning of his Queue<Integer> into the ArrayDeque<Integer>
        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            firstQueue.add(arrayDeque.removeLast());
            arrayDeque.add(firstQueue.remove());
            arrayDeque.add(firstQueue.remove());

            secondQueue.add(arrayDeque.removeLast());
            arrayDeque.add(secondQueue.remove());
            arrayDeque.add(secondQueue.remove());

        }

        return arrayDeque;
    }
}
