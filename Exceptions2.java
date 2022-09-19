import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exceptions2 {
    public static void main(String[] args) {
        try {
            test();
        } catch (IOException | ParseException e) {
            System.out.println("Something wrong with parsing or file not found");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void test() throws FileNotFoundException, ParseException {

    }
}
