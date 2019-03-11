package com.overcome.mode.factory.factorymethod;


public class LifeMethodFactoryTest {


    public static void main(String[] args) {
        ClothesFactory lining = new LiNingClothesFactory();
        lining.produceClothes();
        ShoesFactory nike =  new NikeShoesFactory();
        nike.produceShoes();
    }
}
