import java.util.Scanner;

public class OddNumberTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isOdd(number)) {
            System.out.println(number + " is an odd number.");
        } else {
            System.out.println(number + " is not an odd number.");
        }

        scanner.close();
    }

    // Method to test if a number is odd
    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }
}
