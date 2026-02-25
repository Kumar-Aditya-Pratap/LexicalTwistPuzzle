public class LexicalAnalyzer {

    public static boolean isReverse(String first, String second) {
        String reversed = new StringBuilder(first).reverse().toString();
        return reversed.equalsIgnoreCase(second);
    }

    public static String transform(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return reversed.toLowerCase().replaceAll("[aeiou]", "@");
    }

    public static void analyze(String first, String second) {

        String combined = (first + second).toUpperCase();

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

            String unique = "";
            for (char ch : combined.toCharArray()) {
                if ("AEIOU".indexOf(ch) != -1 && unique.indexOf(ch) == -1) {
                    unique += ch;
                }
                if (unique.length() == 2) break;
            }
            System.out.println(unique);

        } else if (consonantCount > vowelCount) {

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