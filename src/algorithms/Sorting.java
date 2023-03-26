package algorithms;

/**
 * Sorting
 */
public class Sorting {

    public static <T extends Comparable> void selectionSort(T[] values) {
        
        for (int currentIndex = 0; currentIndex < values.length; currentIndex++) {
            for (int targetIndex = currentIndex; targetIndex < values.length; targetIndex++) {
                if (values[targetIndex].compareTo(values[currentIndex]) < 0) {
                    T aux = values[currentIndex];
                    values[currentIndex] = values[targetIndex];
                    values[targetIndex] = aux;
                }
            }
        }
    }
}