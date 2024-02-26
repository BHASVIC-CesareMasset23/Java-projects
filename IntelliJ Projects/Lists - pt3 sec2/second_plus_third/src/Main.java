import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int num;
        do {
            System.out.println("Number:");
            num = Integer.valueOf(scanner.nextLine());
            numbers.add(num);
        } while (num != 0);

        int num1 = numbers.get(1);
        int num2 = numbers.get(2);


        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
    }

}