package com.company;

import java.util.Random;

public class Pitomnic {
    private Dog[] dogkennel = new Dog [5];
    public void AddDogs(){
        for (int i = 0; i<5; i++){
            dogkennel [i] = new Dog("Dog "+i, new Random().nextInt(20));
            System.out.println(dogkennel[i].getName() + " " + dogkennel[i].getAge());
        }
    }
}
