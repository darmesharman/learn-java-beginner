package Serializations;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteToFile {
    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);

        System.out.println(person1);
        System.out.println(person2);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Serializations\\people.bin"))) {
            oos.writeObject(person1);
            oos.writeObject(person2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
