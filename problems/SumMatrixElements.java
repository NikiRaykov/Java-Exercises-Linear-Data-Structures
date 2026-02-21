import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = readMatrixAndReturnCountOfRowsAndCols(sc);


        int sumOfMatrixElements = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sumOfMatrixElements += matrix[row][col];
            }
        }

        System.out.println(sumOfMatrixElements);
    }

    public static int[][] readMatrixAndReturnCountOfRowsAndCols(Scanner scanner) {
        int[] rowsAndCols = readArray(scanner);

        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        System.out.println(rows);
        System.out.println(cols);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = readArray(scanner);
        }


        return matrix;
    }

    public static int[] readArray(Scanner sc) {
        return Arrays.stream(sc.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
