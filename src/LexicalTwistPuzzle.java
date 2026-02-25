import java.util.Scanner;

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        System.out.println("Lexical Twist Puzzle");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String firstWord = scanner.nextLine();

        System.out.print("Enter second word: ");
        String secondWord = scanner.nextLine();

        // Validation: Check single-word constraint
        if (firstWord.contains(" ") || secondWord.contains(" ")) {
            System.out.println("Invalid input: Only single words allowed.");
            return;   // Graceful termination (No System.exit)
        }

        System.out.println("Inputs accepted successfully.");
        // After validation block

        String reversed = new StringBuilder(firstWord).reverse().toString();

        if (reversed.equalsIgnoreCase(secondWord)) {
            System.out.println("The second word is the reverse of the first word.");
        } else {
            System.out.println("The words are not reverse of each other.");
        }

    }
}