package Interfaces;

public class Person implements Info {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public String getInfo() {
        return "My name is " + this.name;
    }
}
