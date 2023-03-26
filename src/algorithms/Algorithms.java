package algorithms;

public class Algorithms {
    public static <T extends Comparable> T findLowerValue(T[] values) {
        if (values.length == 0) {
            return null;
        }

        int lowerValueIndex = 0;

        for (int i = 1; i < values.length; i++) {
            if (values[i].compareTo(values[lowerValueIndex]) < 0) {
                lowerValueIndex = i;
            }
        }

        System.out.println(
            String.format("Lowest value is: %s", values[lowerValueIndex])
        );

        return values[lowerValueIndex];
    }

    public static <T extends Comparable> T findGreatestValue(T[] values) {
        if (values.length == 0) {
            return null;
        }

        int greaterValueIndex = 0;

        for (int i = 1; i < values.length; i++) {
            if (values[i].compareTo(values[greaterValueIndex]) > 0) {
                greaterValueIndex = i;
            }
        }

        System.out.println(
            String.format("Greatest value is: %s", values[greaterValueIndex])
        );

        return values[greaterValueIndex];
    }    
}
