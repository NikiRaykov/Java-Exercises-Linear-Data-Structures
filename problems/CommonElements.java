import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        // Hey hello 2 4
        // 10 hey 4 hello

        for (int i = 0; i < secondArray.length; i++) {
            String el1 = secondArray[i];
            for (int j = 0; j < firstArray.length; j++) {
                String el2 = firstArray[j];

                if (el1.equals(el2)) {
                    System.out.print(el2 + " ");
                }
            }
        }
    }
}
