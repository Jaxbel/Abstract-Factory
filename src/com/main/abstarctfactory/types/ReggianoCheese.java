package com.main.abstarctfactory.types;

import com.main.abstarctfactory.interfaces.Cheese;
//JAZZIEL BELLO NECOCHEA
public class ReggianoCheese implements Cheese {
    public ReggianoCheese()
    {
        prepareCheese();
    }
    public void prepareCheese()
    {
        System.out.println("preparing cheese...");
    }
}
