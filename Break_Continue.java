public class Break_Continue {
    public static void main(String[] args) {
        int value = 0;

        System.out.println("BREAK");
        while (true) {
            if (value == 15) {
                break;
            }
            System.out.println(value);
            value++;
        }
        System.out.println("BREAK");

        System.out.println("Continue");
        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Continue");
    }
}
