import java.util.Scanner;
public class ass1_prob5 {

    static int countWords(String a) {
        if (a == null) {
            return 0;
        }

        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);

            if (Character.isWhitespace(c)) {
                inWord = false;
            } else {

                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            }
        }

        return wordCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String a = sc.nextLine();
        System.out.println("Number of words in the string: " + countWords(a));
    }
}