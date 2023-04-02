import java.util.Arrays;
import java.util.Random;

import algorithms.Sorting;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("\n\nSORTING ALGORITHMS\n\n");

        System.out.println("Original array: \n");
        Integer[] randomNumbers = getRandomNumbers(10);
        printList(randomNumbers);

        printSeparator();

        System.out.println("Selection sort, worse: O(n^2), average: O(n^2), best: O(n^2)\n");
        randomNumbers = getRandomNumbers(10);
        Sorting.selectionSort(randomNumbers);
        printList(randomNumbers);

        printSeparator();

        System.out.println("Bubble sort, worse: O(n^2), average: O(nˆ2): best: O(n)\n");
        randomNumbers = getRandomNumbers(10);
        Sorting.bubbleSort(randomNumbers);
        printList(randomNumbers);
        

        printSeparator();

        System.out.println("Insertion sort, worse: O(n^2), average: O(nˆ2): best: O(n)\n");
        randomNumbers = getRandomNumbers(10);
        Sorting.insertionSort(randomNumbers);
        printList(randomNumbers);        
    }

    private static void printList(Object[] list) {
        System.out.print(Arrays.asList(list).toString());
    }

    private static void printSeparator() {
        System.out.println("\n--------------------\n");
    }

    private static Integer[] getRandomNumbers(int numbers) {
        Integer[] randomNumbers = new Integer[numbers];
        Random random = new Random(10);

        for(int i = 0; i < numbers; i++) {
            randomNumbers[i] = (int) (Math.random() * 20);
        }
        return randomNumbers;
    }

}