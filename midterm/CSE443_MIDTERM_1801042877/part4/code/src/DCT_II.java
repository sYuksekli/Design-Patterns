/**
 * This class represents discrete cosine transform(II) algorithm
 */
public class DCT_II extends Transformations {

    /**
     * Constructor to initialize file name
     * @param _fileName is the file name given in command line
     */
    public DCT_II(String _fileName) {
        this.fileName = _fileName;
    }

    /**
     * This method calculates the results for every sample given in the file
     */
    @Override
    public void calculateResultOfTransformation() {

        for (int k = 0; k < this.N; ++k) {

            double res = 0.0;
            for (int n = 0; n < this.N; ++n) {
                res += this.realInput[n] * Math.cos(Math.PI*(n+0.5)*k/N);
            }

            // DCT works only with real numbers and it produce only reals numbers.
            // So the imag part of the result will be zero always.
            this.realOutput[k] = res;
            this.imagOutput[k] = 0.0;
        }
    }
}
