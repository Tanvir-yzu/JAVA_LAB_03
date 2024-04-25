import java.util.Scanner;

public class RhymeAlliterationTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter the second word: ");
        String word2 = scanner.nextLine();

        if (testRhyme(word1, word2)) {
            System.out.println("The words rhyme!");
        } else {
            System.out.println("The words do not rhyme.");
        }

        if (testAlliteration(word1, word2)) {
            System.out.println("The words alliterate!");
        } else {
            System.out.println("The words do not alliterate.");
        }

        scanner.close();
    }

    // Method to test for rhyming of two words
    public static boolean testRhyme(String word1, String word2) {
        return word1.toLowerCase().endsWith(word2.toLowerCase());
    }

    // Method to test for alliteration of two words
    public static boolean testAlliteration(String word1, String word2) {
        return word1.toLowerCase().charAt(0) == word2.toLowerCase().charAt(0);
    }
}
