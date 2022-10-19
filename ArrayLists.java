import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Arman");
        arrayList1.add("Bake");
        arrayList1.add("Dake");
        System.out.println(arrayList1);

        /* size = 2, capacity = 200
         * capacity will increase when we add more than initialCapacity elements
        */
        ArrayList<String> arrayList2 = new ArrayList<>(200);
        arrayList2.add("Bake");
        arrayList2.add("Dake");

        ArrayList<String> arrayList3 = new ArrayList<>(arrayList1);
        System.out.println(arrayList3);
        // ArrayList3 and ArrayList1 is diff objects with same elements
        System.out.println(arrayList1==arrayList3); // false
    }
}
