import algorithms.Sorting;
import products.Product;
import products.vehicles.Car;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Selection sort, O(n^2):");
        Product[] cars = createCars();
        Sorting.selectionSort(cars);
        for(Product car : cars) {
            System.out.println(car);
        }
        
    }

    private static Product[] createCars() {
        Car[] cars = {
            new Car("BMW 320i 2023", 250000.0),
            new Car("Honda City 2015", 70000.0),
            new Car("VW Polo 2007", 27000.0),
            new Car("VW Fox 2013", 46000.0),
            new Car("VW Gol 1994", 9000.0),
            new Car("Toyota Corola 2020", 105000.0)
        };

        return cars;
    }
}