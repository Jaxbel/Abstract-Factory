package com.main.abstarctfactory.types;

import com.main.abstarctfactory.interfaces.Pepperoni;
//JAZZIEL BELLO NECOCHEA
public class SlicedPepperoni implements Pepperoni {
    public SlicedPepperoni()
    {
        preparePepperoni();
    }
    public void preparePepperoni()
    {
        System.out.println("preparing pepperoni...");
    }
}
