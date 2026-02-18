import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SplitByWordCasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "[,;:.!()?\"'\\\\/\\[\\] ]+";
        String[] splitText = text.split(regex);

        List<String> lowerCase = new ArrayList<>();
        List<String> upperCase = new ArrayList<>();
        List<String> mixedCase = new ArrayList<>();

        for (String word : splitText) {
            if (word.matches("[a-z]+")) {
                lowerCase.add(word);
            } else if (word.matches("[A-Z]+")) {
                upperCase.add(word);
            } else {
                mixedCase.add(word);
            }
        }

        System.out.println("Lower-case: " + String.join(", ", lowerCase));
        System.out.println("Mixed-case: " + String.join(", ", mixedCase));
        System.out.println("Upper-case: " + String.join(", ", upperCase));

    }
}
