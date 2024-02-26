import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int age = 0;
        int oldest_age = 0;
        String oldest_name = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter (firstname,age): ");
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] input_pieces = input.split(",");
            String name = input_pieces[0];
            age = Integer.valueOf(input_pieces[1]);
            if (age > oldest_age) {
                oldest_age = age;
                oldest_name = name;
            }
        }

        System.out.println("Oldest: " + oldest_name + " (" + oldest_age + " years)");
    }
}