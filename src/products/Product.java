package products;

public interface Product extends Comparable<Product> {
    String getName();
    Double getValue();
}
