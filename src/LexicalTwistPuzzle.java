import java.util.Scanner;

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        System.out.println("Lexical Twist Puzzle");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String firstWord = scanner.nextLine();

        System.out.print("Enter second word: ");
        String secondWord = scanner.nextLine();

        if (!WordValidator.isSingleWord(firstWord) ||
                !WordValidator.isSingleWord(secondWord)) {

            System.out.println("Invalid input: Only single words allowed.");
            return;
        }

        if (LexicalAnalyzer.isReverse(firstWord, secondWord)) {
            System.out.println(LexicalAnalyzer.transform(firstWord));
        } else {
            LexicalAnalyzer.analyze(firstWord, secondWord);
        }
    }
}