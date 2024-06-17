
package readfiletext;

import java.io.*;

public class clsReadCSV {
   public static final String delimiter = ",";
   public static void read(String csvFile) {
      try {
         File file = new File(csvFile);
         FileReader fr = new FileReader(file);
         BufferedReader br = new BufferedReader(fr);
         String line = "";
         String[] tempArr;
         while((line = br.readLine()) != null) {
            tempArr = line.split(delimiter);
            for(String tempStr : tempArr) {
               System.out.print(tempStr + " ");
            }
            System.out.println();
         }
         br.close();
         } catch(IOException ioe) {
            ioe.printStackTrace();
         }
   }
   public static void main(String[] args) {
      // csv file to read
     // String csvFile = "c:/temp/Technology.csv";
      String csvFile = "c:/Users/FIKRINIZAM/Desktop/Java/readfiletext/Technology.csv";
      read(csvFile);
      //System.out.println(new File(".").getAbsolutePath());
   }
}
