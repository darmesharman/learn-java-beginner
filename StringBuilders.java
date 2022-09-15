public class StringBuilders {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s + " my" + " friend");
        /**
         * String is immutable and StringBuilder mutable.
         * So StringBuilder faster, because not creating new String objects, but changing existing one
         */
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" my").append(" friend");
        System.out.println(sb.toString());
    }
}
