public class SumOfArray {
    public static void printArrayInStars(int[] array)
    {
        for (int number: array) {
            for (int i=0; i<number; i++) {
                System.out.println("*");
            }
            System.out.println("\n");
        }
    }
}
