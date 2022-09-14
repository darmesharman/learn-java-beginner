public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Robby");
        person1.setAge(30);
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
    }
}

class Person {
    private String name;
    private int age;

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Cannot enter empty name");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Cannot enter negative number to age");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

    int calcYearsUntilRetirement() {
        return 65 - age;
    }

    void speak() {
        System.out.println("My name is " + name + " and I am " + age);
    }

    void sayHello() {
        System.out.println("Hello");
    }
}
