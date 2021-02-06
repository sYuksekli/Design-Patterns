/**
 * Solution type interface to represent behavior of the solution methods
 */
public interface SolutionType {

    /**
     * Abstract solve method. It provides solution of the linear equations.
     * @param _LHS represents the values on the left hand side of the equation
     * @param _RHS represents the values on the right hand side of the equation
     * @return a matrix that contains solution
     */
    double[] solve(double[][] _LHS, double[] _RHS);
}
