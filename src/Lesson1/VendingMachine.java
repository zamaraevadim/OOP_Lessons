package Lesson1;

import java.util.List;

public interface VendingMachine {

    public void initsProducts(List<Product> productList);

    public Product getProduct(String name);
}
