package Step4;

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args)
        {
            // Print out a running total of all the
            // values in the input file.
        // Using a try/catch block. Create new scanner to read from input file.
          try{
           Scanner fileIn = new Scanner(new File("Step4/input.txt"));

           System.out.println("Reading from file ... ");//the text in the parenthesis is a comment
           //initializing the sum, and then running a while loop.

              int sum = 0;
           while(fileIn.hasNextLine()){
               // Reads the entire line as a string
               String lineIn = fileIn.nextLine();
                // transform the String into integer and add to the sum.
               sum += Integer.parseInt(lineIn);
           }

           //Use a printwriter to write the result to the output file.
           PrintWriter fileOut = new PrintWriter("output.txt");
              fileOut.println("Running total = " + sum);
              fileOut.close();

              System.out.println("Running total = " + sum);
              System.out.println("Done!");

          } catch(IOException e) {
             //Display on the console if there is a problem reading a file.
              System.out.println("There is a problem with reading " + e.getMessage());
          }
        }
}