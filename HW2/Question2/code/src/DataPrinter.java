import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class is only used to print data.
 */
public class DataPrinter {

    /**
     * This list holds the DataOfGokturk3 objects
     */
    private ArrayList dataInfos;

    /**
     * Constructor to initialize dataInfos
     * @param _dataInfos represents list that holds DataOfGokturk3 objects
     */
    public DataPrinter(ArrayList _dataInfos) {
        dataInfos = _dataInfos;
    }

    /**
     * It prints the data to the screen
     */
    public void printData() {

        Iterator iterator = dataInfos.iterator();
        while(iterator.hasNext()) {
            DataOfGokturk3 satelliteTypeData = (DataOfGokturk3)  iterator.next();
            printData(satelliteTypeData.createIterator());
            System.out.println();
        }
    }

    /**
     * This is private print method to be used in printData method.
     * @param iterator iterates through the data
     */
    private void printData(DataIterator iterator) {
        while (iterator.hasNext()) {
            int data = (int) iterator.next();
            System.out.print(data + " ");
        }
        System.out.println();
    }

}
