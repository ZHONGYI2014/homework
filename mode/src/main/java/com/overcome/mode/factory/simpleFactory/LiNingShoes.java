package com.overcome.mode.factory.simpleFactory;

import com.overcome.mode.factory.Shoes;

public class LiNingShoes implements Shoes {
    @Override
    public String brand() {
        return "LiNingShoes";
    }

    @Override
    public String size() {
        return null;
    }
}
