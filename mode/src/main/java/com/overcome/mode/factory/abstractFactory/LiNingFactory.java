package com.overcome.mode.factory.abstractFactory;

import com.overcome.mode.factory.Clothes;
import com.overcome.mode.factory.Shoes;
import com.overcome.mode.factory.simpleFactory.LiNingClothes;
import com.overcome.mode.factory.simpleFactory.LiNingShoes;

public class LiNingFactory extends AbstractGoodsFactory{

    @Override
    public Clothes produceClothes() {
        return new LiNingClothes();
    }

    @Override
    public Shoes pruduceShoes() {
        return new LiNingShoes();
    }
}
