import algorithms.Sorting;

import java.util.Arrays;
import java.util.Random;

/**
 * Main
 */
public class Main {

    private static final String MSG_INITIAL_VALUES = "Initial values: ";
    private static final String MSG_SORT_RESULT = "Sort result: ";
    private static final Integer NUMBERS = 10;

    public static void main(String[] args) {

        System.out.println("\nSORTING ALGORITHMS");
        Integer[] randomNumbers;

        printSeparator();

        System.out.println("Selection sort, worse: O(n^2), average: O(n^2), best: O(n^2)\n");
        randomNumbers = getRandomNumbers(NUMBERS);
        printList(randomNumbers, MSG_INITIAL_VALUES);
        Sorting.selectionSort(randomNumbers);
        printList(randomNumbers, MSG_SORT_RESULT);

        printSeparator();

        System.out.println("Bubble sort, worse: O(n^2), average: O(nˆ2): best: O(n)\n");
        randomNumbers = getRandomNumbers(NUMBERS);
        printList(randomNumbers, MSG_INITIAL_VALUES);
        Sorting.bubbleSort(randomNumbers);
        printList(randomNumbers, MSG_SORT_RESULT);


        printSeparator();

        System.out.println("Insertion sort, worse: O(n^2), average: O(nˆ2): best: O(n)\n");
        randomNumbers = getRandomNumbers(NUMBERS);
        printList(randomNumbers, MSG_INITIAL_VALUES);
        Sorting.insertionSort(randomNumbers);
        printList(randomNumbers, MSG_SORT_RESULT);

        printSeparator();

        System.out.println("Shell sort, worse: O(n log n), average: O(n log n): best: O(n log n)\n");
        randomNumbers = getRandomNumbers(NUMBERS);
        printList(randomNumbers, MSG_INITIAL_VALUES);
        Sorting.shellSort(randomNumbers);
        printList(randomNumbers, MSG_SORT_RESULT);

    }

    private static void printList(Object[] list, String message) {
        if (!message.isEmpty()) {
            System.out.println(message);
        }
        System.out.println(Arrays.asList(list).toString());
    }

    private static void printSeparator() {
        System.out.println("\n--------------------\n");
    }

    private static Integer[] getRandomNumbers(int numbers) {
        Integer[] randomNumbers = new Integer[numbers];
        Random random = new Random(100);

        for (int i = 0; i < numbers; i++) {
            randomNumbers[i] = (int) (Math.random() * 100);
        }
        return randomNumbers;
    }

}