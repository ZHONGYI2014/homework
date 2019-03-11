package com.overcome.mode.factory.simpleFactory;

import com.overcome.mode.factory.Clothes;

/**
 *
 */
public class NikeClothes implements Clothes {

    @Override
    public String brand() {
        return "Nike";
    }

    @Override
    public String style() {
        // 款式时尚、个性
        return null;
    }
}
