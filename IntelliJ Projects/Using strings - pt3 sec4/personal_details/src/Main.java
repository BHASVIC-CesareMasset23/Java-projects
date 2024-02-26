import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String longest_name = "";
        int longest_name_length = 0;
        int sum = 0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter (firstname,age): ");
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] input_pieces = input.split(",");
            String name = input_pieces[0];
            int age = Integer.valueOf(input_pieces[1]);
            if (name.length() > longest_name_length) {
                longest_name = name;
            }
            sum += age;
            count ++;
        }

        System.out.println("Longest name: " + longest_name);
        System.out.println("Age average: " + (sum/count));
    }
}