package com.overcome.mode.factory.factorymethod;

import com.overcome.mode.factory.Shoes;
import com.overcome.mode.factory.simpleFactory.NikeShoes;

public class NikeShoesFactory implements ShoesFactory {

    @Override
    public Shoes produceShoes() {
        return new NikeShoes();
    }
}
