import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = readMatrix(scanner);

        int maxSum = Integer.MIN_VALUE;
        int bestRow = 0;
        int bestCol = 0;


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                int sum = matrix[i][j]
                        + matrix[i][j + 1]
                        + matrix[i + 1][j]
                        + matrix[i + 1][j + 1];

                if (sum > maxSum) {
                    maxSum = sum;
                    bestRow = i;
                    bestCol = j;
                }
            }
        }

        System.out.println(matrix[bestRow][bestCol] + " " + matrix[bestRow][bestCol + 1]);
        System.out.println(matrix[bestRow + 1][bestCol] + " " + matrix[bestRow + 1][bestCol + 1]);
        System.out.println(maxSum);

    }

    private static int[][] readMatrix(Scanner scanner) {
        int[] rowsAndCols = readArray(scanner);

        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = readArray(scanner);
        }

        return matrix;
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
