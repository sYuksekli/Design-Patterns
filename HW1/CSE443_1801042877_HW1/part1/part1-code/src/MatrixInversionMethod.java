/**
 * MatrixInversionMethod Class
 * It uses matrix inversion method to solve equations
 */
public class MatrixInversionMethod implements SolutionType {

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
    public MatrixInversionMethod(double [][] LHScoefficients, double [] RHScoefficients, int _dimension) {

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
     * This method solves the linear equations
     * @param _LHS represents the values on the left hand side of the equation
     * @param _RHS represents the values on the right hand side of the equation
     */
    @Override
    public double[] solve(double[][] _LHS, double[] _RHS) {

        double [][] inverseLHS = new double[dimension][dimension];
        double [] solution = new double[dimension];
        double res = 0;
        inverseLHS = Helper.getInverseMatrix(_LHS, dimension);

        for (int i = 0; i < dimension; ++i) {
            for (int j = 0; j < dimension; ++j) {
                res += inverseLHS[i][j]*RHS[j];
            }
            solution[i] = res;
            res = 0;
        }
        return solution;

    }
}
