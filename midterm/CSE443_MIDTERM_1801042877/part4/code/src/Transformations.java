import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * This class encapsulates 1D-transformation algorithms.
 */
public abstract class Transformations {

    /**
     * data member to read a file with this name. This file represents input numbers.
     */
    protected String fileName;

    /**
     * It is the number of samples
     */
    protected int N;

    /**
     * Real input numbers given in file
     */
    protected double[] realInput;

    /**
     * Calculated numbers after transformation. This array represents only real numbers.
     */
    protected double[] realOutput;

    /**
     * Calculated numbers after transformation. This array represents only complex numbers.
     */
    protected double[] imagOutput;

    /**
     * No parameter constructor
     */
    public Transformations() { }

    /**
     * This method performs translation using some algorithm
     * @throws IOException if operations about file goes wrong
     */
    public final void performProcess() throws IOException {

        // To calculate execution time of the transformation
        long startTime = System.currentTimeMillis();

        readFromFile();
        calculateResultOfTransformation();
        writeToFile();

        // Transformation is done, calculate the total time
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        // hook function
        if(userWantExecutionTime())
            System.out.println("Execution time in milliseconds: " + totalTime);
    }

    /**
     * This method read the input numbers from a file
     * @throws IOException if operations about file goes wrong
     */
    public final void readFromFile() throws IOException {

        // File name will be read from command line.
        // It can be added from Run/Edit Configurations menu.
        String input = "";
        try {
            Scanner reader = new Scanner(new FileInputStream(fileName));
            while (reader.hasNextLine())
                input += reader.nextLine();
            reader.close();
        }

        catch (IOException exception) {
            System.err.println("Exception occured");
        }

        // Split input using tab delimiter
        String [] splitInput = input.split("\t");

        // Initialize data members
        this.N = splitInput.length;
        realInput = new double[this.N];
        realOutput = new double[this.N];
        imagOutput = new double[this.N];

        // Convert strings to double
        for (int i = 0; i < this.N; i++) {
            realInput[i] = Double.parseDouble(splitInput[i]);
        }
    }

    /**
     * This method writes the calculated numbers to a file
     * @throws IOException if operations about file goes wrong
     */
    public final void writeToFile() throws IOException{

        try {
            //  Create a file with "results.txt" name
            File file = new File("results.txt");
            file.createNewFile();
            FileWriter writer = new FileWriter(file.getName());

            // Write the results to file
            for (int i = 0; i < this.N; i++) {
                writer.write(String.valueOf(realOutput[i]));
                writer.write(" + j");
                writer.write(String.valueOf(imagOutput[i]));
                writer.write("\n");
            }
            writer.close();

        } catch (IOException exception) {
            System.err.println("Exception occured");
        }
    }

    /**
     * This abstract method calculates the result using an algorithm
     */
    public abstract void calculateResultOfTransformation();

    /**
     * Hook method to ask user if he/she wants to know execution time.
     * @return true if user wants the know execution time
     * @throws IOException if the operation of getting input from user goes wrong
     */
    public  boolean userWantExecutionTime() throws IOException{
        return false;
    }

}
