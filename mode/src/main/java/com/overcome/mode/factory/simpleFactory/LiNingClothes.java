package com.overcome.mode.factory.simpleFactory;

import com.overcome.mode.factory.Clothes;

public class LiNingClothes implements Clothes {

    @Override
    public String brand() {
        return "LiNing";
    }

    @Override
    public String style() {
        // 款式运动、舒适
        return null;
    }
}
