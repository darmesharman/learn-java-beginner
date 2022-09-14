public class Foreach {
    public static void main(String[] args) {
        String strings[] = new String[3];
        strings[0] = "Hello";
        strings[1] = "Bye";
        strings[2] = "Java";

        for (String string : strings) {
            System.out.println(string);
        }

        int numbers[] = { 1, 2, 3 };
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
