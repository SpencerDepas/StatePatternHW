package com.clearfaun.playing.around;

/**
 * Created by SpencerDepas on 5/12/16.
 */
public class Chicken {

    private AnimalState inHeat;
    private AnimalState notInHeat;

    private AnimalState animalState;

    public Chicken(){
        inHeat = new InHeat();
        notInHeat = new NotInHeat();

        animalState = notInHeat;

    }

    void setHeat(AnimalState isInHeat){

        animalState = isInHeat;

    }

    public void feedChicken(){
        animalState.feedAnimal();
    }

    public void cleanChicken(){
        animalState.cleanAnimal();
    }

    public void inseminateChicken(){
        animalState.inseminate();
    }

}
