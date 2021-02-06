/**
 * Linear Solver Deluxe class to solve linear equations.
 * It can use different methods to solve equations.
 */
public class LinearSolverDeluxe {

    /**
     * solution field to represent solution type
     */
    private SolutionType solution;

    /**
     * Constructor to select solution type
     * @param _solution  represents the solution type
     */
    public LinearSolverDeluxe(SolutionType _solution) {
        this.solution = _solution;
    }

    /**
     * Setter method to change the solution type
     * @param _solution represents the solution type
     */
    public void setSolution(SolutionType _solution) {
        this.solution = _solution;
    }

    /**
     * solveEquation method solves the linear equation bu using a specific method
     * @param _LHS represents the values on the left hand side of the equation
     * @param _RHS represents the values on the right hand side of the equation
     * @return a matrix that contains solution
     */
    public double[] solveEquation(double[][] _LHS, double[] _RHS) {
        return solution.solve(_LHS,_RHS);
    }
}
