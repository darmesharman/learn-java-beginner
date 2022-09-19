package Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(1));
        animals.add(new Animal(2));
        animals.add(new Animal(3));

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());

        test(animals);
        test(dogs);
    }

    /**
     * <? extends Animal>, means Generic of Animal and its children
     * without it or with <Animals> we cannot except test(dogs)
     * <?> also can use this which mean Object class
     */
    public static void test(List<? extends Animal> list) {
        for (Animal animal: list) {
            System.out.println(animal);
        }
    }
}

class Animal {
    int id;

    public Animal() {

    }

    public Animal(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}

class Dog extends Animal {

}