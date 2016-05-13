package com.clearfaun.playing.around;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Chicken pennyTheChickenGoblar = new Chicken();

        pennyTheChickenGoblar.feedChicken();

        pennyTheChickenGoblar.cleanChicken();

        pennyTheChickenGoblar.inseminateChicken();
        //Regular food is served
        //Cleaning
        //We can not inseminate when not in heat


        System.out.println();
        pennyTheChickenGoblar.setHeat(new InHeat());

        pennyTheChickenGoblar.feedChicken();

        pennyTheChickenGoblar.cleanChicken();

        pennyTheChickenGoblar.inseminateChicken();

        //When chickens are in heat we give them extra food
        //We do not clean Chickens when they are in heat
        //When chickens are in heat we inseminate them to make more chickens
    }
}
