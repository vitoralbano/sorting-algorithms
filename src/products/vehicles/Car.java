package products.vehicles;

import java.text.DecimalFormat;

import products.Product;

/**
 * Car
 */
public class Car implements Product{

    private String name;
    private Double value;

    public Car(String name, Double value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public int compareTo(Product product) {
        return getValue().compareTo(product.getValue());
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("%s -> %.2f", name, value);
        
    }

}