package com.overcome.mode.factory.simpleFactory;

/**
 * 生产衣服、鞋子
 */
public class LifeFactory {


    public Object produce(String goods) {
        /** 简单工厂职责重, 需要生产各种各样的东西 */
        if ("LiNingClothes".equals(goods)) {
            return new LiNingClothes();
        } else if("NikeClothes".equals(goods)) {
            return new NikeClothes();
        } else if("LiNingShoes".equals(goods)) {
            return new LiNingShoes();
        } else if("NikeShoes".equals(goods)) {
            return new NikeShoes();
        }
        return null;
    }

    public static void main(String[] args) {
        LifeFactory factory = new LifeFactory();
        System.out.println(factory.produce("LiNingShoes"));
    }

}
