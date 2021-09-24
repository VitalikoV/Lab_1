package com.company;

public class Matrix {
    private int[][] matrix;
    private String nameOfMatrix;

    public Matrix(String nameOfMatrix, int[][] matrix){
        this.nameOfMatrix = nameOfMatrix;
        this.matrix = matrix;
    }

    public Matrix transposeMatrix() {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transposedMatrix = new int[columns][rows];

        for(int i = 0; i < columns; ++i) {
            for(int j = 0; j < rows; ++j) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }

        return new Matrix("transposed matrix", transposedMatrix);
    }

    public Matrix multiplyMatrixOnMatrix( Matrix matrixToMultiply) {
        int[][] matrixToMultiplyVal = matrixToMultiply.getMatrix();

        int rowsOfFirstMatrix = matrix.length;
        int columnsOfFirstMatrix = matrix[0].length;

        int rowsOfSecondMatrix = matrixToMultiplyVal.length;
        int columnsOfSecondMatrix = matrixToMultiplyVal[0].length;

        int[][] multipliedMatrix = new int[rowsOfFirstMatrix][columnsOfFirstMatrix];

        if (rowsOfFirstMatrix != rowsOfSecondMatrix || columnsOfFirstMatrix != columnsOfSecondMatrix) {
            System.out.println("Elements is not applicable for multiplying");
        } else {
            for (int i = 0; i < rowsOfFirstMatrix; ++i) {
                for (int j = 0; j < columnsOfFirstMatrix; ++j) {
                    multipliedMatrix[i][j] = matrix[i][j] * matrixToMultiplyVal[i][j];
                }
            }
        }
        return new Matrix("multiplied matrix", multipliedMatrix);
    }

    public void printToConsole() {
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

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public String getNameOfMatrix() {
        return nameOfMatrix;
    }

    public void setNameOfMatrix(String nameOfMatrix) {
        this.nameOfMatrix = nameOfMatrix;
    }
}
