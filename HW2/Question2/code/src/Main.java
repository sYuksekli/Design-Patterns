import java.util.ArrayList;

/**
 * Driver class to test design pattern
 */
public class Main {

    public static void main(String[] args) {


        // I creates different types of data arrays
        int[][] data1_ofGokturk3 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        print2Ddata(data1_ofGokturk3,1);

        int[][] data2_ofGokturk3 = {{1,2,3},{4,5,6},{7,8,9}};
        print2Ddata(data2_ofGokturk3,2);

        int[][] data3_ofGokturk3 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        print2Ddata(data3_ofGokturk3,3);

        int[][] data4_ofGokturk3 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        print2Ddata(data4_ofGokturk3,4);

        // Create data objects
        // Only DataType1 objects are created, because it uses spirallyAntiClockWiseIterator
        // DataType2 objects use spirallyClockwiseIterator which is not implemented
        DataType1 data1 = new DataType1(data1_ofGokturk3);
        DataType1 data2 = new DataType1(data2_ofGokturk3);
        DataType1 data3 = new DataType1(data3_ofGokturk3);
        DataType1 data4 = new DataType1(data4_ofGokturk3);

        ArrayList data_infos = new ArrayList();
        data_infos.add(data1);
        data_infos.add(data2);
        data_infos.add(data3);
        data_infos.add(data4);


        System.out.println("Iterator should iterate them and print 2D array spirally anti-clockwise");
        // Print the results to the screen via data printer
        DataPrinter printer = new DataPrinter(data_infos);
        printer.printData();

    }

    public static void print2Ddata(int[][] data, int order) {

        System.out.println("Data" + order + " in 2D form");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
