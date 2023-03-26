package algorithms;

/**
 * Sorting
 */
public class Sorting {

    public static <T extends Comparable> void selectionSort(T[] items) {
        for (int currentIndex = 0; currentIndex < items.length; currentIndex++) {
            int smaller = currentIndex;
            for (int targetIndex = currentIndex + 1; targetIndex < items.length; targetIndex++) {
                if (items[targetIndex].compareTo(items[smaller]) < 0) {
                    smaller = targetIndex;
                }
            }
            T aux = items[smaller];
            items[smaller] = items[currentIndex];
            items[currentIndex] = aux;
        }
    }
}