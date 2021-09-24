package com.company.Utils;

public class Task5Utils {
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transposedMatrix = new int[columns][rows];

        for(int i = 0; i < columns; ++i) {
            for(int j = 0; j < rows; ++j) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }

        return transposedMatrix;
    }

    public static void printToConsole(String nameOfMatrix, int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        System.out.println("------------------");
        System.out.println(nameOfMatrix);
        System.out.print("[");

        for(int i = 0; i < columns; ++i) {
            System.out.print("[");

            for(int j = 0; j < rows; ++j) {
                System.out.print(matrix[i][j] + ", ");
            }

            System.out.print("]");
        }

        System.out.println("]");
    }
}
