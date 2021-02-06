/**
 * Helper class to provide some mathematical operations
 */
public class Helper {

    /**
     * This method finds the minor matrix
     * @param _LHS is the matrix on the left side of equation
     * @param i is index of matrix as a row
     * @param j is the index of matrix as a column
     * @param _dimension is the number of variables in the matrix
     * @return minor matrix of the matrix that is on the left side of equation
     */
    public static double[][] getMinor(double[][] _LHS, int i, int j, int _dimension) {

        // To save minor matrix, a new matrix called minor is created
        double[][] minor = new double[_dimension-1][_dimension-1];

        // index of matrix, initially zero
        int row = 0, col = 0;

        for (int m = 0; m < _dimension; m++) {

            // Close the i th row and look at the remaining matrix
            if (m == i) continue;

            for (int k = 0; k < _dimension; k++) {

                // Close the j th column and look at the remaining matrix
                if (k == j) continue;

                minor[row][col] = _LHS[m][k];
                col++;

                if (col >= _dimension-1) {
                    col = 0;
                    row++;
                }
            }
        }
        return minor;
    }

    /**
     * This method gets the determinant of the matrix
     * @param _LHS is the matrix on the left side of equation
     * @param _dimension is the number of variables in the matrix
     * @return the determinant of the matrix
     */
    public static double getDeterminant(double[][] _LHS, int _dimension) {

        // In case of 1x1 matrix
        if(_dimension == 1) return _LHS[0][0];

        // In case of 2x2 matrix
        if(_dimension == 2) {
            return _LHS[0][0]*_LHS[1][1] - _LHS[0][1]*_LHS[1][0];
        }

        // In case of dimension is bigger or equal than three
        double det = 0;
        double[][] minor;
        for (int i = 0; i < _dimension; i++) {

            minor = getMinor(_LHS, 0, i, _dimension);
            det += Math.pow(-1, i) * getDeterminant(minor, _dimension-1) * _LHS[0][i];
        }

        return det;
    }

    /**
     * This method finds the adjoint matrix
     * @param _LHS is the matrix on the left side of equation
     * @param _dimension _dimension is the number of variables in the matrix
     * @return adjoint matrix
     */
    public static double[][] getAdjoint(double[][] _LHS, int _dimension) {

        // A new matrix called adjointMatrix is crreated to store adjoint matrix
        double[][] adjointMatrix = new double[_dimension][_dimension];

        for (int i = 0; i < _dimension; i++) {
            for (int j = 0; j < _dimension; j++) {

                // places of the i and j indexes are changed to get the transpose of the matrix
                double [][] minor = getMinor(_LHS,j,i,_dimension);
                double det = getDeterminant(minor,_dimension-1);
                double res = Math.pow(-1, i+j) * det;

                // Control it in case of getting zero value
                if(Math.abs(res) <= 10e-6) res = 0;
                // Assign the result
                adjointMatrix[i][j] = res;
            }
        }

        return adjointMatrix;
    }

    /**
     * This method finds the inverse of the matrix
     * @param _LHS is the matrix on the left side of equation
     * @param _dimension _dimension is the number of variables in the matrix
     * @return inverse matrix
     */
    public static double[][] getInverseMatrix(double[][] _LHS, int _dimension) {

        // A new matrix called inverse matrix is created to store values of the inverse matrix
        double[][] inverseMatrix = new double[_dimension][_dimension];

        // Calculate the determinant of the left side matrix
        double value = getDeterminant(_LHS, _dimension);

        // Control it if the determinant is zero.
        // If it is zero, then there is no solution or there are infinite solution
        if(Math.abs(value) <= 10e-6) {
            System.out.println("There is no solution for this equation");
            return null;
        }

        for (int i = 0; i < _dimension; i++) {
            for (int j = 0; j < _dimension; j++) {

                double[][] tmp = getAdjoint(_LHS,_dimension);
                double val = tmp[i][j] / value;
                inverseMatrix[i][j] = val;
            }
        }

        return inverseMatrix;
    }



}
