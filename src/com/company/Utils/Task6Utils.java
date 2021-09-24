package com.company.Utils;

public class Task6Utils {
    public static int[][] multiplyMatrixOnMatrix(int[][] firstMatrix, int[][] secondMatrix) {
        int rowsOfFirstMatrix = firstMatrix.length;
        int columnsOfFirstMatrix = firstMatrix[0].length;

        int rowsOfSecondMatrix = secondMatrix.length;
        int columnsOfSecondMatrix = secondMatrix[0].length;

        int[][] multipliedMatrix = new int[rowsOfFirstMatrix][columnsOfFirstMatrix];

        if (rowsOfFirstMatrix != rowsOfSecondMatrix || columnsOfFirstMatrix != columnsOfSecondMatrix) {
            System.out.println("Elements is not applicable for multiplying");
        } else {
            for (int i = 0; i < rowsOfFirstMatrix; ++i) {
                for (int j = 0; j < columnsOfFirstMatrix; ++j) {
                    multipliedMatrix[i][j] = firstMatrix[i][j] * secondMatrix[i][j];
                }
            }
        }
        return multipliedMatrix;
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
