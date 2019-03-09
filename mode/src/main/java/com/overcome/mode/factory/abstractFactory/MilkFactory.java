package com.overcome.mode.factory.abstractFactory;

import com.overcome.mode.factory.MengNiu;
import com.overcome.mode.factory.Milk;
import com.overcome.mode.factory.Telunsu;

public class MilkFactory extends AbstractFactory {

    public Milk getMengniu() {
        return new MengNiu();
    }

    public Milk getTelunsu() {
        return new Telunsu();
    }

}
