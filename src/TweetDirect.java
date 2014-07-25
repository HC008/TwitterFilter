import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Read in political CSV files and compares the data. 
 * Final results would be filtered data 
 * 
 * @author Hansen Cheng and Micah Angeles
 *
 */
public class TweetDirect {

  /**
   * Main interface
   * 
   * @param args - IO arguments
   */
  public static void main(String[] args) {
    
    Processor process = new Processor();
    List<String[]> dataOne = new ArrayList<String[]>();
    List<String[]> dataTwo = new ArrayList<String[]>();
    Scanner readIn = new Scanner(System.in);
    String fileOne = "", fileTwo = "";
    String test = "Test";
    
    System.out.print("Please enter first file name: ");
    fileOne = readIn.nextLine();
    
    System.out.print("\nPlease enter second file name: ");
    fileTwo = readIn.nextLine();
    
    dataOne = process.readCsv(dataOne, fileOne);
    dataTwo = process.readCsv(dataTwo, fileTwo);
    
    System.out.println("\nFirst file size " + dataOne.size() + 
                        " Second file size " + dataTwo.size());

  }
  
}
