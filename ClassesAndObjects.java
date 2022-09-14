public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Arman";
        person1.age = 22;
        System.out.println("My name is " + person1.name + " and I am " + person1.age);

        Person person2 = new Person();
        person2.name = "Bake";
        person2.age = 23;
        System.out.println("My name is " + person2.name + " and I am " + person2.age);
    }
}

class Person {
    String name;
    int age;
}
