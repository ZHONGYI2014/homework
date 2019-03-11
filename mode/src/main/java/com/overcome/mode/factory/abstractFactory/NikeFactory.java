package com.overcome.mode.factory.abstractFactory;

import com.overcome.mode.factory.Clothes;
import com.overcome.mode.factory.Shoes;
import com.overcome.mode.factory.simpleFactory.NikeClothes;
import com.overcome.mode.factory.simpleFactory.NikeShoes;

public class NikeFactory extends AbstractGoodsFactory {
    @Override
    public Clothes produceClothes() {
        return new NikeClothes();
    }

    @Override
    public Shoes pruduceShoes() {
        return new NikeShoes();
    }
}
