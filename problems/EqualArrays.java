import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array1 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] array2 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        int sum = 0; boolean areIdentical = true; int diffIndex = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                areIdentical = false;
                diffIndex = i;
                break;
            } else {
                sum += array1[i];
            }
        }

        if (!areIdentical) {
            System.out.printf("Arrays are not identical. Found difference at %d index.", diffIndex);
        } else {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }

    }
}

// 1 2 3 4 5
// 1 2 4 3 5