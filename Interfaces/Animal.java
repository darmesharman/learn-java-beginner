package Interfaces;

public class Animal implements Info {
    int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("I am sleeping");
    }

    @Override
    public String getInfo() {
        return "My id is " + this.id;
    }
}

