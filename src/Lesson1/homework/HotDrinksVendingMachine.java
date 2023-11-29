package Lesson1.homework;

import Lesson1.Product;
import Lesson1.VendingMachine;

import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {

    List<Product> hotDrinks;
    @Override
    public void initsProducts(List<Product> productList) {
        hotDrinks = productList;
    }

    @Override
    public Product getProduct(String name) {
        for(Product i : hotDrinks){
            if(i.getName().equals((name))){
                return i;
            }
        }
        return null;
    }
    public Product getProduct(String name, double volume, int temperature){
        for(Product i : hotDrinks){
            if(i.getName().equals((name)) && volume == i.getVolume() && temperature == i.getTemperature()){
                return i;
            }
        }
        return null;
    }
}
