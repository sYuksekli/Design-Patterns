import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class represents discrete fourier transform algorithm
 */
public class DFT extends Transformations {

    /**
     * Constructor to initialize file name
     * @param _fileName is the file name given in command line
     */
    public DFT(String _fileName) {
        this.fileName = _fileName;
    }

    /**
     * This method calculates the results for every sample given in the file
     */
    @Override
    public void calculateResultOfTransformation() {

        for (int k = 0; k < this.N; ++k) {

            double resInReal = 0.0;
            double resInImag = 0.0;

            for (int n = 0; n < this.N; ++n) {
                // Actually full formula is for the line given in below :
                // realInput[n] * Math.cos(2*Math.PI*n*k/N) + imagInput[n] * Math.sin(2*Math.PI*n*k/N)
                // but in our case, the file contain only real numbers, so I didn't write the full equation
                resInReal += this.realInput[n] * Math.cos(2*Math.PI*n*k/N) ;

                // The same thing is valid for this line too. Full formula is:
                // -realInput[n] * Math.sin(2*Math.PI*n*k/N) + imagInput[n] * Math.cos(2*Math.PI*n*k/N);
                resInImag += -this.realInput[n] * Math.sin(2*Math.PI*n*k/N);
            }
            this.realOutput[k] = resInReal;
            this.imagOutput[k] = resInImag;
        }
    }


    /**
     * Hook method to ask user if he/she wants to know execution time.
     * @return true if user wants the know execution time
     * @throws IOException if the operation of getting input from user goes wrong
     */
    @Override
    public boolean userWantExecutionTime() throws IOException{
        String ans = getUserInput();
        if (ans.equalsIgnoreCase("yes"))
            return true;
        else
            return false;
    }

    /**
     * This method gets the input from user as yes or no.
     * @return a string that contains the answer entered from user
     * @throws IOException if the operation of getting input from user goes wrong
     */
    private String getUserInput() throws IOException {

        String answer = null;
        System.out.println("Would you like to know execution time");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = reader.readLine();
        } catch (IOException exception) {
            System.err.println("Exception occured");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
