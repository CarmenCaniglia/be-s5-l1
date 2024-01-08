package carmen.bes5l1.entities;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Product> products = new ArrayList<>();

    public void addProduct (Product product){
        products.add(product);
    }

    public void printMenu (){
        for(Product product : products){
            System.out.println(product.getDescription() + " - Price: "+ product.getPrice() +"€");
        }
    }
}
