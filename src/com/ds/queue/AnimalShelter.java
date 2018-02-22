package com.ds.queue;

import java.util.LinkedList;

/**
 * <B>Problem Statement:<B/>
 * <pre>
 * An animal shelter, which holds only dogs and cats, operates on a strictly "first in, first out" basis.
 * People must adopt either the "oldest" (based on arrival time) of all animals at the shelter,
 * or they can select whether they would prefer a dog or a cat (and will receive the oldest animal of
 * that type). They cannot select which specific animal they would like. Create the data structures to
 * maintain this system and implement operations such as enqueue, dequeueAny, dequeueDog,
 * and dequeueCat. You may use the built-in Linkedlist data structure.
 * <pre/>
 */
public class AnimalShelter {

    LinkedList<Dog> dogs = new LinkedList<>();
    LinkedList<Cat> cats = new LinkedList<>();

    private int order;

    public void enqueue(Animal animal) {

        animal.setOrder(order++);
        if(animal instanceof Cat){
            cats.add((Cat)animal);
        }else{
            dogs.add((Dog) animal);
        }
    }

    public Animal dequeueDog() {
        return dogs.poll();
    }

    public Animal dequeueCat() {
        return cats.poll();
    }

    public Animal dequeueAny() {

        if(cats.peek().isOlderThan(dogs.peek())){
            return dequeueCat();
        }else{
            return dequeueDog();
        }
    }
}

abstract class Animal {
    private int order;
    private String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public boolean isOlderThan(Animal animal) {
        return this.order < animal.order;
    }
}


class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
}
