import java.util.Scanner;

public class ReverseAnArrayOfStringsAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");

        // a b c d e f
        // 0 1 2 3 4 5

        // 0 -> 5
        // 1 -> 4
        // 2 -> 3

        // i -> array.length - 1 - i
        // 0 -> 6 - 1 - 0 = 5
        // 1 -> 6 - 1 - 1 -> 4
        // 2 -> 6 - 1 - 2 -> 3


        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        for (String s : array) {
            System.out.print(s + " ");
        }
    }
}
