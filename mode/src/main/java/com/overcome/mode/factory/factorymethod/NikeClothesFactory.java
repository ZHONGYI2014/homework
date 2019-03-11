package com.overcome.mode.factory.factorymethod;

import com.overcome.mode.factory.Clothes;
import com.overcome.mode.factory.simpleFactory.NikeClothes;

public class NikeClothesFactory implements ClothesFactory{
    @Override
    public Clothes produceClothes() {
        return new NikeClothes();
    }
}
