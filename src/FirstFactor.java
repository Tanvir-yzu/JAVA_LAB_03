import java.util.Scanner;

public class FirstFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int firstFactor = findFirstFactor(number);

        if (firstFactor != -1) {
            System.out.println("The first factor of " + number + " is: " + firstFactor);
        } else {
            System.out.println(number + " is a prime number, it has no factors other than 1 and itself.");
        }

        scanner.close();
    }

    // Function to find the first factor of a number
    public static int findFirstFactor(int num) {
        if (num <= 1) {
            return -1; // -1 indicates prime number or invalid input
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return i;
            }
        }

        return -1; // -1 indicates prime number
    }
}
