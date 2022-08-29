package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> list = new LinkedList<>();
        int counter = everyDishNumberToEat;

        List<Integer> listOfDishes = new LinkedList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            listOfDishes.add(i);
        }
        while (list.size() != numberOfDishes && !listOfDishes.isEmpty()) {
            counter = counter == 0 ? listOfDishes.size() - 1 : counter - 1;
            list.add(listOfDishes.get(counter));
            listOfDishes.remove(counter);//

            counter += everyDishNumberToEat;
            if (listOfDishes.size() == 0) {
                break;
            }
            if (counter >= listOfDishes.size()) {
                counter = counter % listOfDishes.size();
            }

        }
        return list;
    }
}
