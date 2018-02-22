package com.ds.queue;

import java.util.Objects;

public class AnimalShelterTest {

    public static void main(String[] args) {
        System.out.println("Hello this is animal shelter");
        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.enqueue(new Dog("dog1"));
        animalShelter.enqueue(new Cat("cat1"));
        animalShelter.enqueue(new Cat("cat2"));
        animalShelter.enqueue(new Dog("dog2"));
        animalShelter.enqueue(new Dog("dog3"));
        animalShelter.enqueue(new Cat("cat4"));
        animalShelter.enqueue(new Dog("dog4"));

        System.out.println(animalShelter.dequeueAny().getName());
    }
}
