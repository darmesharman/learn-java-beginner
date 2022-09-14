import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*string input*/
        System.out.println("Enter something");
        String string = scanner.nextLine();

        System.out.println(string);

        /*int input*/
        System.out.println("Enter some number");
        int myInt = scanner.nextInt();

        System.out.println(myInt);
    }
}
