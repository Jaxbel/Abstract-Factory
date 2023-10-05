package com.main.abstarctfactory.factorys;

import com.main.abstarctfactory.interfaces.Cheese;
import com.main.abstarctfactory.interfaces.Dough;
import com.main.abstarctfactory.interfaces.Pepperoni;
import com.main.abstarctfactory.interfaces.Sauce;
//JAZZIEL BELLO NECOCHEA
public interface PizzaIngredientFactory {

    public Dough CreateDough();
    public Sauce CreateSauce();
    public Cheese CreateCheese();
    public Pepperoni CreatePepperoni();
}
