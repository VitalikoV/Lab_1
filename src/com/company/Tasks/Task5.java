package com.company.Tasks;

import com.company.Matrix;
import com.company.Task;
import com.company.Utils.Task5Utils;

public class Task5 implements Task {
    public void executeTask(){
        final int[][] matrixVal = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        Matrix matrix = new Matrix("matrix", matrixVal);

        Matrix transposedMatrix = matrix.transposeMatrix();
        transposedMatrix.printToConsole();
    }
}
