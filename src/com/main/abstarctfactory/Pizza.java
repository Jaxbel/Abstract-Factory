package com.main.abstarctfactory;

import com.main.abstarctfactory.interfaces.Cheese;
import com.main.abstarctfactory.interfaces.Dough;
import com.main.abstarctfactory.interfaces.Pepperoni;
import com.main.abstarctfactory.interfaces.Sauce;
//JAZZIEL BELLO NECOCHEA
public abstract class Pizza {
    public String name;

    public Dough dough;
    public Sauce sauce;
    public Cheese cheese;
    public Pepperoni pepperoni;

    public abstract void Prepare();
    public void Bake()
    {
        System.out.println("-Bake for 25 minutes at 350");
    }
    public void Cut()
    {
        System.out.println("-Cutting the pizza into diagonal slices");
    }
    public void Box()
    {
        System.out.println("-Place pizza in official PizzaStore box");
    }
    public void Message()
    {
        System.out.println("\t\n-- Customer ordered a " + name + "-- \n");
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String GetName()
    {
        return name;
    }

}
