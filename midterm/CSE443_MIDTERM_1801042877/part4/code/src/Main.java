import java.io.IOException;

/**
 * Driver for testing
 * DFT transformation is comment by default. User can uncomment it to test.
 * If I did not comment this line, the results of the dct transformation written
 * to the file, would be overwritten by the new results of the dft transformation.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        // Creat objects to make transformation
        DCT_II dct_transformation = new DCT_II(args[0]);
        DFT dft_transformation = new DFT(args[0]);

        // Function for transformation.
        //You can try by removing the comment in order.
        dct_transformation.performProcess();
        //dft_transformation.performProcess();

    }
}
