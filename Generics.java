import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        ////////// Java 5 ////////////////////////////
        List list1 = new ArrayList();
        list1.add("dog");
        list1.add("cat");
        list1.add("frog");

        /*String animal1 = list1.get(1); error */
        String animal1 = (String) list1.get(1);

        ////////// Generics //////////////////////////
        List<String> list2 = new ArrayList<String>();
        list2.add("dog");
        list2.add("cat");
        list2.add("frog");

        /*list2.add(new Human()); error (can store only String) */

        /*String animal2 = (String) list2.get(1); no need to downcast */
        String animal2 = list2.get(1);

        ////////// Generics from Java 7 //////////////
        List<String> list3 = new ArrayList<>(); // no need double definition
        list3.add("dog");
        list3.add("cat");
        list3.add("frog");

        String animal3 = list3.get(1);

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
    }
}

class Human {

}
