public class Printf {
    public static void main(String[] args) {
        System.out.printf("My name is %s and I am %d. \n", "Arman", 22);
        System.out.println();

        System.out.printf("Digits: %7d \n", 124122);    /* Digits:  124122  */
        System.out.printf("Digits: %7d \n", 124);       /* Digits:     124  */
        System.out.printf("Digits: %7d \n", 1);         /* Digits:       1  */
        System.out.printf("Digits: %7d \n", 12412333);  /* Digits: 12412333 */
        System.out.println();

        System.out.printf("Float: %.2f \n", 1.2);       /* Float: 1.20 */
        System.out.printf("Float: %.2f \n", 1.2649413); /* Float: 1.26 */
        System.out.println();

        System.out.printf("Float: %10.2f \n", 1.2);       /* Float:       1.20 */
        System.out.printf("Float: %10.2f \n", 1.2649413); /* Float:       1.26 */
        System.out.println();
    }
}
