import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num;
        int lowest_num = 9999;
        int nums_in_list = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        do {
            System.out.println("Number:");
            num = Integer.valueOf(scanner.nextLine());
            numbers.add(num);
            nums_in_list ++;
        } while (num != 9999);
        for (int i=0; i<nums_in_list; i++) {
            if (numbers.get(i) < lowest_num) {
                lowest_num = numbers.get(i);
            }
        }
        System.out.println("Lowest number:" + lowest_num);
        for (int i=0; i<nums_in_list; i++) {
            if (numbers.get(i) == lowest_num) {
                System.out.println("Found in index: " + i);
            }
        }
    }
}