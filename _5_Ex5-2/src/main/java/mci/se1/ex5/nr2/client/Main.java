package mci.se1.ex5.nr2.client;

import mci.se1.ex5.nr2.strategy.BubbleSort;
import mci.se1.ex5.nr2.strategy.Context;
import mci.se1.ex5.nr2.strategy.InsertionSort;

/**
 * Design and implement a Java application
 * that makes it possible to sort an array of
 * integer values using different sorting algorithms
 * (such as e.g. the insertion sort, the bubble sort, and others).
 */
public class Main {
    public static void main(String[] args) {
        // integer array which should be sorted
        int[] arrayToBeSorted = {99,55,44,1,105};
        int[] arrayToBeSorted2 = {150, 2, 69, 23, 5};

        Context context = new Context(new BubbleSort(arrayToBeSorted));
        context.executeSorting();

        System.out.println("------");


        context = new Context(new InsertionSort(arrayToBeSorted2));
        context.executeSorting();




    }
}