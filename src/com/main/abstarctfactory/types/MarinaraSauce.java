package com.main.abstarctfactory.types;

import com.main.abstarctfactory.interfaces.Sauce;
//JAZZIEL BELLO NECOCHEA
public class MarinaraSauce implements Sauce {

    public MarinaraSauce()
    {
        prepareSauce();
    }
    public void prepareSauce()
    {
        System.out.println("preparing sauce...");
    }

}
