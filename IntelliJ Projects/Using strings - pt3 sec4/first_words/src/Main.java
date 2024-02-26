import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String sentence;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Words:");
        sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        System.out.println(words[0]);
    }
}