import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
   * @return tweets - the filled up list of records.
   */
  public List<TweetRecord> readCsv(List<TweetRecord> tweets, String fileName) {
   
    try {

      CSVReader file = new CSVReader(new FileReader(fileName));
      List<String[]> data = new ArrayList<String[]>();
      String [] nextLine;
      int lineNumber = 3;
      
      while ((nextLine = file.readNext()) != null) {
        data.add(nextLine);
      }
      
      while (lineNumber >= 3 && lineNumber < data.size() - 1) {
        tweets.add(new TweetRecord(data.get(lineNumber)[0], data.get(lineNumber)[1], 
                                   data.get(lineNumber)[2], data.get(lineNumber)[3],
                                   data.get(lineNumber)[4], data.get(lineNumber)[5],
                                   data.get(lineNumber)[6], data.get(lineNumber)[7],
                                   data.get(lineNumber)[8]));
        
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
 
    return tweets;
  }
  
  
  
  /**
   * To compare the data if there are any duplicates in comments.
   * 
   * @param csvOne - first file.
   * @param csvTwo - second file.
   */
  public void checkDuplicate(List<TweetRecord> csvOne, List<TweetRecord> csvTwo) {
    int small = 0, large = 0;
    
    //Test which file size is smaller than the other.
    if (csvOne.size() < csvTwo.size()) {
      small = csvOne.size();
      large = csvTwo.size();
      
      for (int i = 0; i < small; i++) {
        for (int j = 0; j < large; j++) {
          if (csvOne.get(i).getText().equals(csvTwo.get(j).getText())) {
            
          }
        }
      }
    }
    else {
      small = csvTwo.size();
      large = csvOne.size();
    }   
  }
  
}
