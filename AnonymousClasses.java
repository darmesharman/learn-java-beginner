interface Eatable {
    public void eat();
}

public class AnonymousClasses {
    public static void main(String[] args) {
        Eatable eatable = new Eatable() {
            @Override
            public void eat() {
                System.out.println("I am eating");
            }
        };

        eatable.eat();
    }
}
