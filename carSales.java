package Lab10;

import java.io.*;
import java.util.StringTokenizer;

public class carSales
{
	
   private static BufferedReader file_in;

public static void main(String args[])
   {

      try
      {
        file_in = new BufferedReader(new FileReader("sales.dat"));
        
        StringTokenizer tokenizer;
        String inputLine;
        int totalSales = 0;  
        inputLine = file_in.readLine(); // read line from input file
        while(inputLine != null)
        { // while not eof
          tokenizer = new StringTokenizer(inputLine);
          tokenizer.nextToken();   // skip country name
          try
          {
            totalSales += Integer.parseInt(tokenizer.nextToken()) * 
                             Integer.parseInt(tokenizer.nextToken());
          }
          catch(NumberFormatException e)
          { System.out.println("Error in input file format");   }

          inputLine = file_in.readLine(); // get the next line
        } // end while not eof
        System.out.println("Total car sales in euro: " + totalSales);
      }
      catch(FileNotFoundException e)
      { System.out.println("Input file: " + args[0] + "not found"); }
      catch(IOException e)
      { System.out.println("Unexpected I/O error, quitting..."); }
   }
}

