package com.maggioni.MatrixMultiply;

import org.junit.Test;
import static org.junit.Assert.*;

public class MatrixMultiplyTest {
    
    public MatrixMultiplyTest() {
    }

    @Test
    public void testMatrixOnexThreeMultipliedByMatrixThreexOne() {
        Matrix firstMatrix = setupFirstMatrix();                 
        Matrix secondMatrix = setupSecondMatrix();
        
        Matrix expecteds = setupExpectedMatrix();
        
        Matrix actuals = firstMatrix.multiply(secondMatrix);
        assertEquals(expecteds, actuals);
        
    }

    private Matrix setupExpectedMatrix() {
        Matrix expecteds = new Matrix(1,2);
        expecteds.matrix[0][0] = 83;
        expecteds.matrix[0][1] = 63;
        return expecteds;
    }

    private Matrix setupSecondMatrix() {
        Matrix secondMatrix = new Matrix(3,2);
        secondMatrix.matrix[0][0] = 13;
        secondMatrix.matrix[1][0] = 8;
        secondMatrix.matrix[2][0] = 6;
        secondMatrix.matrix[0][1] = 9;
        secondMatrix.matrix[1][1] = 7;
        secondMatrix.matrix[2][1] = 4;
        return secondMatrix;
    }

    private Matrix setupFirstMatrix() {
        Matrix firstMatrix = new Matrix(1,3);
        firstMatrix.matrix[0][0] = 3;
        firstMatrix.matrix[0][1] = 4;
        firstMatrix.matrix[0][2] = 2;
        return firstMatrix;
    }
}
