package AbstractClasses;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        cat.makeSound();
        dog.eat();
        cat.makeSound();
    }
}
