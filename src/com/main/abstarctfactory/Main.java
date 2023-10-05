package com.main.abstarctfactory;

import com.main.abstarctfactory.stores.NYPizzaStore;
import com.main.abstarctfactory.stores.PizzaStore;

//JAZZIEL BELLO NECOCHEA
public class Main {
    public static void main(String[] args) {

        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.OrderPizza("cheese");
        nyPizzaStore.OrderPizza("pepperoni");

    }
}