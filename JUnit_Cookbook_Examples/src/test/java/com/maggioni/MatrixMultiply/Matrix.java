
package com.maggioni.MatrixMultiply;

import java.util.Arrays;


class Matrix {

    int row;
    int column;
    int[][] matrix;
    
    public Matrix(int row, int column) {
        this.matrix = new int[row][column];
        this.row = row;
        this.column = column;
    }

    public Matrix multiply(Matrix other) {
        System.out.println(this.row + "  " + other.column);
        Matrix result = new Matrix(this.row, other.column);
        for (int i = 0; i < result.column; i++) {
        int sum = 0;
            for (int j = 0; j < this.row; j++) {
                for (int k = 0; k < other.row; k++) {
                    sum += (matrix[j][k] * other.matrix[k][i]);
                }
                result.matrix[j][i] = sum;
            }
        }       
        return result;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Arrays.deepHashCode(this.matrix);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Matrix other = (Matrix) obj;
        if (!Arrays.deepEquals(this.matrix, other.matrix)) {
            return false;
        }
        return true;
    }
    
    
    
}
