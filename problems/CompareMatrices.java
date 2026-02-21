import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrixOne = readMatrix(sc);
        int[][] matrixTwo = readMatrix(sc);

        System.out.print(compareMatrix(matrixOne, matrixTwo));
    }



    public static int[][] readMatrix(Scanner scanner) {
        int[] rowsAndCols = readArray(scanner);

        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = readArray(scanner);
        }

        return matrix;
    }

    public static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
    }

    private static String compareMatrix(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length) {
            return "not equal";
        }

        for (int row = 0; row < firstMatrix.length; row++) {
            if (firstMatrix[row].length != secondMatrix[row].length) {
                return "not equal";
            }
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]) {
                    return "not equal";
                }
            }
        }

        return "equal";
    }
}

//1 2 3
//2 1 3

//1 2 3
//2 1 3