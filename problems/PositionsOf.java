import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matrix = readMatrix(scan);

        int numberToFind = scan.nextInt();

        findNumberInMatrix(matrix, numberToFind);
    }

    private static void findNumberInMatrix(int[][] matrix, int numberToFind) {
        boolean isFound = false;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == numberToFind) {
                    isFound = true;
                    System.out.println(row + " " + col + " ");
                }
            }
        }

        if (!isFound) {
            System.out.println("not found");
        }
    }


    public static int[][] readMatrix(Scanner scan) {
        int[] rowsAndCols = readArray(scan);

        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
           matrix[row] = readArray(scan);
        }

        return matrix;
    }

    public static int[] readArray(Scanner scan) {
        return Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
