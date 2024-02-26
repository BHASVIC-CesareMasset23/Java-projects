public class Main
{
    public static void main(String[] args)
    {
        int[] numbers = {3, 7, 8, 1, 2};
        neatPrint(numbers);

    }
    public static void neatPrint(int[] integerArray)
    {
        for (int number: integerArray) {
            System.out.print(number);
            if (number != integerArray[integerArray.length - 1]) {
                System.out.print(", ");
            }

        }
    }
}