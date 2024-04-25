import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock-Paper-Scissors game!");
        System.out.println("Enter your choice: 1 for Rock, 2 for Paper, 3 for Scissors");
        System.out.println("Enter 'q' to quit.");

        while (true) {
            System.out.print("Your choice: ");
            String userInput = scanner.next();

            if (userInput.equals("q")) {
                System.out.println("Thanks for playing. Goodbye!");
                break;
            }

            int userChoice;
            try {
                userChoice = Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 3, or 'q' to quit.");
                continue;
            }

            if (userChoice < 1 || userChoice > 3) {
                System.out.println("Invalid choice. Please enter a number between 1 and 3, or 'q' to quit.");
                continue;
            }

            int computerChoice = random.nextInt(3) + 1; // Generates a random number between 1 and 3

            System.out.println("Computer's choice: " + computerChoice);

            // Determine the winner
            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if ((userChoice == 1 && computerChoice == 3) ||
                    (userChoice == 2 && computerChoice == 1) ||
                    (userChoice == 3 && computerChoice == 2)) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }

        scanner.close();
    }
}
