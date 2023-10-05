package com.main.abstarctfactory.stores;

import com.main.abstarctfactory.Pizza;
//JAZZIEL BELLO NECOCHEA
public abstract class PizzaStore {
    public Pizza OrderPizza(String type)
    {
        Pizza pizza = CreatePizza(type);

        pizza.Prepare();
        pizza.Bake();
        pizza.Cut();
        pizza.Box();
        pizza.Message();

        return pizza;
    }

    public abstract Pizza CreatePizza(String type);
}
