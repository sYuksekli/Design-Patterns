/**
 * GaussianEliminationMethod Class
 * It uses gaussian elimination method to solve equations
 */
public class GaussianEliminationMethod implements SolutionType {

    /**
     * Represents the coefficients of the matrix
     */
    private double [][] LHS;

    /**
     * Represents the values on the right side of equation
     */
    private double [] RHS;

    /**
     * Represents the number of variables that the linear equation has
     */
    private int dimension;

    /**
     * Constructor to initialize dimension of the matrix and its coefficients
     * @param LHScoefficients represents the values on the left side of equation
     * @param RHScoefficients represents the values on the right side of equation
     * @param _dimension Represents the number of variables that the linear equation has
     */
    public GaussianEliminationMethod(double [][] LHScoefficients, double [] RHScoefficients, int _dimension) {

        LHS = new double[_dimension][_dimension];
        RHS = new double[_dimension];

        for (int i= 0; i < _dimension; ++i) {
            for (int j = 0; j < _dimension; ++ j) {
                LHS[i][j] = LHScoefficients[i][j];
            }
        }

        for (int i = 0; i < _dimension; ++i) {
            RHS[i] = RHScoefficients[i];
        }

       this. dimension = _dimension;
    }

    /**
     * This method solves the linear equations by using partial pivoting technique
     * @param _LHS represents the values on the left hand side of the equation
     * @param _RHS represents the values on the right hand side of the equation
     */
    @Override
    public double[] solve(double[][] _LHS, double[] _RHS) {

        int _dimension = _RHS.length;
        for (int k = 0; k < _dimension; k++)
        {
            // First find the row that has the larger value
            int maxVal = k;
            for (int i = k + 1; i < _dimension; i++)
                if (Math.abs(_LHS[i][k]) > Math.abs(_LHS[maxVal][k]))
                    maxVal = i;

            // Swap the rows.
            // For example let's say third row has the largest number. Then for the first loop
            // we should swap the places third and first row.
            double[] temp = _LHS[k];
            _LHS[k] = _LHS[maxVal];
            _LHS[maxVal] = temp;

            // Do the same swapping operation for the right side of the equation.
            double tmp = _RHS[k];
            _RHS[k] = _RHS[maxVal];
            _RHS[maxVal] = tmp;

            // After swapping, we should perform a row operation to the zero (i,j) element.
            // For example after swap operation for the first loop, we should calculate the lambda value for second row and first column.
            // And every element of the second row must be subtracted from (lambda * every element of the first row)
            for (int i = k + 1; i < _dimension; i++)
            {
                double lambda = _LHS[i][k] / _LHS[k][k];
                _RHS[i] -= lambda * _RHS[k];
                for (int j = k; j < _dimension; j++)
                    _LHS[i][j] -= lambda * _LHS[k][j];
            }
        }

        // Then after do the same thing for every row, we should perform back substitution
        // Since last row has only one non-zero value, we will find the xn directly and
        // Then we will put them in place for the other rows
        double[] solution = new double[_dimension];
        for (int i = _dimension - 1; i >= 0; i--)
        {
            double res = 0.0;
            for (int j = i + 1; j < _dimension; j++)
                res += _LHS[i][j] * solution[j];
            solution[i] = (_RHS[i] - res) / _LHS[i][i];
        }

        return solution;
    }
}
