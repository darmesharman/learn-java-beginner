public class ClassWrapper {
    public static void main(String[] args) {
        int primitive = 123;
        Integer wrapper = 123;

        System.out.println(Integer.toBinaryString(2));

        // simple change primitive to wrapper and otherwise
        primitive = wrapper;
        wrapper = primitive;
    }
}
