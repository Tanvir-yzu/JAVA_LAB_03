import java.util.Random;

public class DiceRollSum {
    public static void main(String[] args) {
        Random random = new Random();
        int rollCount = 0;

        System.out.println("Rolling two dice until the sum reaches 7...");

        while (true) {
            int die1 = random.nextInt(6) + 1; // Roll the first die
            int die2 = random.nextInt(6) + 1; // Roll the second die

            int sum = die1 + die2;
            rollCount++;

            System.out.println("Roll " + rollCount + ": Die 1 = " + die1 + ", Die 2 = " + die2 + ", Sum = " + sum);

            if (sum == 7) {
                System.out.println("Sum of 7 reached after " + rollCount + " rolls.");
                break;
            }
        }
    }
}
