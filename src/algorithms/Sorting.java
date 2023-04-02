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

    public static <T extends Comparable> void bubbleSort(T[] items) {
        for (int i = 0; i < items.length; i++) {
            boolean swap = false;

            for (int m = i + 1; m < items.length; m++) {
                if (items[m].compareTo(items[i]) < 0) {
                    swap = true;
                    T aux = items[m];
                    items[m] = items[i];
                    items[i] = aux;
                }
            }

            if (swap == false) { break; }
        }
    }

    public static <T extends Comparable> void insertionSort(T[] items) {
        for (int index = 0; index < items.length; index++) {
            int targetIndex = index;
            int previousIndex = index - 1;
            while(targetIndex > 0 && items[targetIndex].compareTo(items[previousIndex]) < 0) {
                T aux = items[targetIndex];
                items[targetIndex] = items[previousIndex];
                items[previousIndex] = aux; 
                targetIndex--;
                previousIndex = targetIndex - 1;
            }
        }
    }

}