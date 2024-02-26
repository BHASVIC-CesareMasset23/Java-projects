import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        String name;
        do {
            System.out.println("Name:");
            name = scanner.nextLine();
            names.add(name);
        } while (!name.equals(""));

        System.out.println(names.get(2));
    }

}