public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Robby", 30);
        person1.sayHello();
        person1.speak();
        int year1 = person1.calcYearsUntilRetirement();
        System.out.println(year1 + " until retirement");

        Person person2 = new Person();
        person1.setNameAndAge("Robby", 30);
        person1.sayHello();
        person2.speak();
        int year2 = person2.calcYearsUntilRetirement();
        System.out.println(year2 + " until retirement");
    }
}

class Person {
    String name;
    int age;

    void setNameAndAge(String name, int age) {
        this.name = name;
        this.age = age;
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
