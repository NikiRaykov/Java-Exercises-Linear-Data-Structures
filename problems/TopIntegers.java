import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // 1 4 3 2
        for (int i = 0; i < numbers.length; i++) {
            boolean isTopEl = true;
            int topEl = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                int nextNumber = numbers[j];
                if (nextNumber >= topEl) {
                    isTopEl = false;
                    break;
                }
            }

            if (isTopEl) {
                System.out.print(topEl + " ");
            }
        }
    }
}
