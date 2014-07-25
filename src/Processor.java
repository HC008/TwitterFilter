import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import au.com.bytecode.opencsv.CSVReader;

/**
 * To perform various action for the main program.
 * 
 * @author Hansen Cheng & Micah Angeles
 *
 */
public class Processor {
  
  public Processor() {
    
  }
  
  /**
   * It reads in all of the data from the CSV file.
   * 
   * @param data - String array list.
   * @param fileName - name of file to be read in.
   * @return data - the filled up list of String array.
   */
  public List<String[]> readCsv(List<String[]> data, String fileName) {
    try {

      CSVReader file = new CSVReader(new FileReader(fileName));
      
      String [] nextLine;
      while ((nextLine = file.readNext()) != null) {
        data.add(nextLine);
      }
      
    }
    catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
 
    return data;
  }
  
  /**
   * To compare the data if there are any duplicates in comments.
   * 
   * @param csvOne
   * @param csvTwo
   */
  public void checkDuplicate(List<String[]> csvOne, List<String[]> csvTwo) {
    
  }
  
}
