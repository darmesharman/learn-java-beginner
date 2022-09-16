package Casting;

public class Test {
    public static void main(String[] args) {
        /* Upcasting */
        Animal animal = new Dog();

        /* Downcasting */
        Dog dog = (Dog) animal;
        dog.bark();

        /* Downcasting dangerous. Example below */
        Animal animal1 = new Animal();
        Dog dog1 = (Dog) animal1;
        dog1.bark(); /* !!!RUNTIME ERROR!!! */
    }
}