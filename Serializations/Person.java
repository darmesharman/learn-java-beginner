package Serializations;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 20220923l;

    private int id;
    private transient String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id: " + this.id;
    }
}
