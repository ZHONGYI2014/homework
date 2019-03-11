package com.overcome.mode.factory.factorymethod;

import com.overcome.mode.factory.Shoes;
import com.overcome.mode.factory.simpleFactory.LiNingShoes;

public class LiNingShoesFactory implements ShoesFactory{

    @Override
    public Shoes produceShoes() {
        return new LiNingShoes();
    }
}
