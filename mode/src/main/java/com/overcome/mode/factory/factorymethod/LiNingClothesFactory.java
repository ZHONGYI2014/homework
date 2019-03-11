package com.overcome.mode.factory.factorymethod;

import com.overcome.mode.factory.Clothes;
import com.overcome.mode.factory.simpleFactory.LiNingClothes;

public class LiNingClothesFactory implements ClothesFactory{

    @Override
    public Clothes produceClothes() {
        return new LiNingClothes();
    }
}
