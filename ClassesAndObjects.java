public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Robby");
        person1.setAge(30);
        person1.speak();

        Person person2 = new Person("Mike");
        person2.speak();

        Person person3 = new Person("Vito", 60);
        person3.speak();
    }
}

class Person {
    private String name;
    private int age;

    public Person() {
        this.setName("John Doe");
        this.setAge(0);
    }

    public Person(String name) {
        this.setName(name);
        this.setAge(0);
    }

    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

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
