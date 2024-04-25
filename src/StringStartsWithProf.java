import java.util.Scanner;

public class StringStartsWithProf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (input.startsWith("Prof")) {
            System.out.println("The input starts with 'Prof'.");
        } else {
            System.out.println("The input does not start with 'Prof'.");
        }

        scanner.close();
    }
}
