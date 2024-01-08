package carmen.bes5l1;

import carmen.bes5l1.entities.Drink;
import carmen.bes5l1.entities.Menu;
import carmen.bes5l1.entities.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {

    @Bean
    public Pizza margherita(){
        Pizza pizza = new Pizza("Margherita", 6.00);
        pizza.addTopping("Tomato");
        pizza.addTopping("Mozzarella");
        return pizza;
    }
    @Bean
    public Pizza peperoni(){
        Pizza pizza = new Pizza("Peperoni",7.50);
        pizza.addTopping("Tomato");
        pizza.addTopping("Mozzarella");
        pizza.addTopping("Peperoni");
        return pizza;
    }

    @Bean
    public Drink cocaCola(){
        return new Drink("Coca Cola", 2.50);
    }

    @Bean
    public Drink water(){
        return new Drink("Natural water",1.00);
    }

    @Bean
    public Menu menu(){
        Menu menu = new Menu();
        menu.addProduct(margherita());
        menu.addProduct(peperoni());
        menu.addProduct(water());
        menu.addProduct(cocaCola());
        return menu;
    }
}
