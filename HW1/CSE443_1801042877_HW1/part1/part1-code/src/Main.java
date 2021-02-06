import java.util.Scanner;

/**
 * Driver class to test program
 */
public class Main {

    public static void main(String[] args) {

    	// Create scanner object to read inputs from user
	    Scanner scanner = new Scanner(System.in);


	    boolean isExit = false;
	    while (!isExit) {


			// Take the number of variables present in equation from user
			System.out.println("Please enter how many variables there are");
			int numOfVariable = scanner.nextInt();

			// RHS matrix
			double [] B = new double[numOfVariable];
			// LHS matrix
			double [][] A = new double[numOfVariable][numOfVariable];
			// Solution matrix
			double [] solution;

			// Take the values of variables from user
			System.out.println("Please enter the coefficients of variables");
			for (int i = 0; i < numOfVariable; ++i) {
				for (int j = 0; j < numOfVariable; ++j) {
					A[i][j] = scanner.nextDouble();
				}
			}

			// Take the values on the right side of the equation
			System.out.println("Please enter the values of the right hand side");
			for (int i = 0; i < numOfVariable; ++i) {
				B[i] = scanner.nextDouble();
			}

			// Create an object of LinearSolverDeluxe to solve problem with gauss elimination method
			GaussianEliminationMethod gaussMethod = new GaussianEliminationMethod(A, B, numOfVariable);
			// Create an object of LinearSolverDeluxe to solve problem with matrix inversion method
			MatrixInversionMethod inversionMethod = new MatrixInversionMethod(A, B, numOfVariable);

			// Default type. It can be changed dynamically by using setter
			LinearSolverDeluxe solver = new LinearSolverDeluxe(gaussMethod);

			System.out.println("Choose the solution type");
			System.out.println("Enter 1 to choose Gaussian Elimination Method");
			System.out.println("Enter 2 to choose Matrix Inversion Method");

			int choice = scanner.nextInt();

			if (choice == 1) {
				// Call the solve method to get solution
				solution = solver.solveEquation(A,B);
				for (int i = 0; i < numOfVariable; ++i) {
						System.out.println("x" + i + " : " + solution[i]);
				}
			}

			else if(choice == 2) {
				solver.setSolution(inversionMethod);
				// Call the solve method to get solution
				solution = solver.solveEquation(A,B);
				for (int i = 0; i < numOfVariable; ++i) {
					System.out.println("x" + i + " : " + solution[i]);
				}
			}

			else {
				System.out.println("Please enter a valid choice");
			}

			System.out.println("Do you want to continue ? y/n");
			char res = scanner.next().charAt(0);

			if (res == 'n'){
				isExit = true;
			}
	    }

    }
}
