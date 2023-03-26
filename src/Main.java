import algorithms.Sorting;
import products.Product;
import products.vehicles.Car;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("\n\nSORTING ALGORITHMS\n\n");

        System.out.println("Original array: \n");
        Product[] cars = createCars();
        printList(cars);

        printSeparator();

        System.out.println("Selection sort, worse: O(n^2), average: O(n^2), best: O(n^2)\n");
        cars = createCars();
        Sorting.selectionSort(cars);
        printList(cars);

        printSeparator();

        System.out.println("Bubble sort, worse: O(n^2), average: O(nˆ2): best: O(n)\n");
        cars = createCars();
        Sorting.bubbleSort(cars);
        printList(cars);
        
    }

    private static void printList(Object[] list) {
        for(Object o : list) {
            System.out.println(o.toString());
        }
    }

    private static void printSeparator() {
        System.out.println("\n--------------------\n");
    }

    private static Product[] createCars() {
        Car[] cars = {
            new Car("BMW 320i 2023", 250000.0),
            new Car("Honda City 2015", 70000.0),
            new Car("VW Polo 2007", 27000.0),
            new Car("VW Fox 2013", 46000.0),
            new Car("VW Gol 1994", 9000.0),
            new Car("Toyota Corola 2020", 120400.0),
            new Car("Toyota Yaris 2018", 93000.0),
            new Car("Mercedes Benz GLA 200 2019", 215000.0),
            new Car("Honda CRV 2017", 97000.0),
            new Car("Honda Fit 2014", 53000.0),
            new Car("VW T-Cross 2020", 92000.0),
            new Car("Honda Civic 2016", 77000.0),
            new Car("Fiat Palio 2018", 54000.0),
            new Car("Jeep Renegade", 98500.0),
            new Car("Jeep Compass", 135200.0)
        };

        return cars;
    }
}