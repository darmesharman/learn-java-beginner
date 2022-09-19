import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) {
        try {
            readInputFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        System.out.println("After try-catch");
    }

    public static void readInputFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input"));
    }
}
