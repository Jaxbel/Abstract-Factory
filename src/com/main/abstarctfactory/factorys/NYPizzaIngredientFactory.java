package com.main.abstarctfactory.factorys;

import com.main.abstarctfactory.interfaces.Cheese;
import com.main.abstarctfactory.interfaces.Dough;
import com.main.abstarctfactory.interfaces.Pepperoni;
import com.main.abstarctfactory.interfaces.Sauce;
import com.main.abstarctfactory.types.MarinaraSauce;
import com.main.abstarctfactory.types.ReggianoCheese;
import com.main.abstarctfactory.types.SlicedPepperoni;
import com.main.abstarctfactory.types.ThinCrustDough;
//JAZZIEL BELLO NECOCHEA
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    public Dough CreateDough()
    {
        return new ThinCrustDough();
    }

    public Sauce CreateSauce()
    {
        return new MarinaraSauce();
    }

    public Cheese CreateCheese()
    {
        return new ReggianoCheese();
    }
    public Pepperoni CreatePepperoni()
    {
        return new SlicedPepperoni();
    }

}
