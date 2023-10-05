package com.main.abstarctfactory.pizzas;

import com.main.abstarctfactory.Pizza;
import com.main.abstarctfactory.factorys.PizzaIngredientFactory;
//JAZZIEL BELLO NECOCHEA
public class PepperoniPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory)
    {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void Prepare()
    {
        System.out.println("-- Preparing " + name + " --\n");
        dough = ingredientFactory.CreateDough();
        sauce = ingredientFactory.CreateSauce();
        cheese = ingredientFactory.CreateCheese();
        pepperoni = ingredientFactory.CreatePepperoni();
    }
}
