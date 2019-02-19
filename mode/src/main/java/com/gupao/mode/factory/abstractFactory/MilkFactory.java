package com.gupao.mode.factory.abstractFactory;

import com.gupao.mode.factory.MengNiu;
import com.gupao.mode.factory.Milk;
import com.gupao.mode.factory.Telunsu;

public class MilkFactory extends AbstractFactory {

    public Milk getMengniu() {
        return new MengNiu();
    }

    public Milk getTelunsu() {
        return new Telunsu();
    }
}
