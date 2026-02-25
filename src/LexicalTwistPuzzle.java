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

            String lower = reversed.toLowerCase();

            String transformed = lower.replaceAll("[aeiou]", "@");

            System.out.println(transformed);

        } else {

            String combined = (firstWord + secondWord).toUpperCase();

            int vowelCount = 0;
            int consonantCount = 0;

            for (char ch : combined.toCharArray()) {
                if ("AEIOU".indexOf(ch) != -1) {
                    vowelCount++;
                } else if (Character.isLetter(ch)) {
                    consonantCount++;
                }
            }

            if (vowelCount > consonantCount) {

                System.out.print("First 2 unique vowels: ");
                String unique = "";
                for (char ch : combined.toCharArray()) {
                    if ("AEIOU".indexOf(ch) != -1 && unique.indexOf(ch) == -1) {
                        unique += ch;
                    }
                    if (unique.length() == 2) break;
                }
                System.out.println(unique);

            } else if (consonantCount > vowelCount) {

                System.out.print("First 2 unique consonants: ");
                String unique = "";
                for (char ch : combined.toCharArray()) {
                    if (Character.isLetter(ch) &&
                            "AEIOU".indexOf(ch) == -1 &&
                            unique.indexOf(ch) == -1) {
                        unique += ch;
                    }
                    if (unique.length() == 2) break;
                }
                System.out.println(unique);

            } else {
                System.out.println("Vowels and consonants are equal");
            }

        }


    }
}