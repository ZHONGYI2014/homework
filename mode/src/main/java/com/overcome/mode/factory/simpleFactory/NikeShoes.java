package com.overcome.mode.factory.simpleFactory;

import com.overcome.mode.factory.Shoes;

public class NikeShoes implements Shoes {


    @Override
    public String brand() {
        return "nikeShoes";
    }

    @Override
    public String size() {
        return null;
    }
}
