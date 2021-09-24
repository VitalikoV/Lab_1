package com.company.Tasks;

import com.company.Matrix;
import com.company.Task;
import com.company.Utils.Task5Utils;
import com.company.Utils.Task6Utils;

public class Task6 implements Task {
    @Override
    public void executeTask() {
        final int[][] firstMatrixVal = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        final int[][] secondMatrixVal = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        Matrix firstMatrix = new Matrix("first matrix", firstMatrixVal);
        Matrix secondMatrix = new Matrix("second matrix", secondMatrixVal);

        final Matrix multipliedMatrix = firstMatrix.multiplyMatrixOnMatrix(secondMatrix);

        multipliedMatrix.printToConsole();
    }
}
