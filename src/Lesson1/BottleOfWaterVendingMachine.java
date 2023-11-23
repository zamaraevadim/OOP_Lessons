package Lesson1;

import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine {

    private List<Product> bottleOfWaters;

    @Override
    public void initsProducts(List<Product> productList) {
        bottleOfWaters = productList;

    }

    @Override
    public Product getProduct(String name) {
        for(Product i : bottleOfWaters){
            if(i.getName().equals((name))){
                return i;
            }
        }
        return null;
    }
    public Product getProduct(String name, double volume){
        for(Product i : bottleOfWaters){
            if(i.getName().equals((name)) && volume == i.getVolume()){
                return i;
            }
        }
        return null;
    }
}
