package com.clearfaun.playing.around;

/**
 * Created by SpencerDepas on 5/12/16.
 */
public class InHeat implements AnimalState {
    @Override
    public void feedAnimal() {
        System.out.println("When chickens are in heat we give them extra food");
    }

    @Override
    public void cleanAnimal() {
        System.out.println("We do not clean Chickens when they are in heat");

    }

    @Override
    public void inseminate() {
        System.out.println("When chickens are in heat we inseminate them to make more chickens");

    }
}
