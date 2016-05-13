package com.clearfaun.playing.around;

/**
 * Created by SpencerDepas on 5/12/16.
 */
public class NotInHeat implements AnimalState {
    @Override
    public void feedAnimal() {
        System.out.println("Regular food is served");

    }

    @Override
    public void cleanAnimal() {
        System.out.println("Cleaning");

    }

    @Override
    public void inseminate() {
        System.out.println("We can not inseminate when not in heat");

    }
}
