import algorithms.Algorithms;
import products.impl.ProductImpl;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Double[] values = {
            1000000.0,
            46000.0,
            16000.0,
            46000.0,
            17000.0
        };

        Algorithms.findLowerValue(values);
        Algorithms.findGreatestValue(values);

        ProductImpl[] products = createProducts();

        Algorithms.findLowerValue(products);
        Algorithms.findGreatestValue(products);

    }

    private static ProductImpl[] createProducts() {
        ProductImpl[] products = {
            new ProductImpl("BMW 320i 2023", 250000.0),
            new ProductImpl("Honda City 2015", 70000.0),
            new ProductImpl("VW Polo 2007", 27000.0),
            new ProductImpl("VW Fox 2013", 46000.0)
        };

        return products;
    }
}