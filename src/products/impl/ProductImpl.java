package products.impl;

import products.Product;

public class ProductImpl implements Product, Comparable<Product> {

    private String name;
    private Double value;

    public ProductImpl(String name, Double value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public int compareTo(Product product) {
        return this.value.compareTo(product.getValue());
    }

    public Double getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ProductImpl [name=" + name + ", value=" + value + "]";
    }

}
