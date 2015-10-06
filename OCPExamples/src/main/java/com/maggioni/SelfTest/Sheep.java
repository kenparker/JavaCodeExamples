package com.maggioni.SelfTest;

interface Hungry<E> {void munch(E x);}
interface Carnivore<E extends Animal> extends Hungry<E> {}
interface Herbivore<E extends Plant> extends  Hungry<E> {}
abstract class Plant{}
class Grass extends Plant{}
abstract class Animal{}

public class Sheep extends Plant implements Carnivore<Wolf>{
    public void munch(Sheep x) {}

    @Override
    public void munch(Wolf x) {
        //
    }

}

class Wolf extends Animal implements Herbivore<Sheep> {
    @Override
    public void munch(Sheep x) {}
}
