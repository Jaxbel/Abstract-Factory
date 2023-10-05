package com.main.abstarctfactory.types;

import com.main.abstarctfactory.interfaces.Dough;

public class ThinCrustDough implements Dough {

    public ThinCrustDough()
    {
        prepareDough();
    }

    public void prepareDough()
    {
        System.out.println("preparing dough...");
    }

}
