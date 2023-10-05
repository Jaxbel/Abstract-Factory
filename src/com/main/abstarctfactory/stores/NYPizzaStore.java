package com.main.abstarctfactory.stores;

import com.main.abstarctfactory.Pizza;
import com.main.abstarctfactory.factorys.NYPizzaIngredientFactory;
import com.main.abstarctfactory.factorys.PizzaIngredientFactory;
import com.main.abstarctfactory.pizzas.CheesePizza;
import com.main.abstarctfactory.pizzas.PepperoniPizza;
//JAZZIEL BELLO NECOCHEA
public class NYPizzaStore extends PizzaStore{

    @Override
    public Pizza CreatePizza(String item)
    {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese"))
        {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        else if (item.equals("pepperoni"))
        {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
