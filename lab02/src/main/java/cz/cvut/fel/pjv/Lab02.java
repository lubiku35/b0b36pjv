package cz.cvut.fel.pjv;
import java.util.Arrays;
import java.util.Scanner;
import cz.cvut.fel.pjv.TextIO;
public class Lab02 {
 
   // Scanner for inputs
   Scanner input = new TextIO().stdin;
   private double[] numbers = new double[10];
   public int num_counter = 0;
   private double average = 0;
   private double variance = 0;
   public static boolean checkLine(String line) {
      return TextIO.isInteger(line) || TextIO.isFloat(line) || TextIO.isDouble(line);
   }
   public void calcAverageAndVariance() {
      // Average formula
      average = 0;
      for (int i = 0; i < num_counter; i++) { average = average + numbers[i]; }
      average = average / num_counter;
 
      // Variance formula
      variance = 0;
      double difference = 0;
      double sum = 0;
      for (int i = 0; i < num_counter; i++) {
         difference = Math.pow((numbers[i] - average), 2);
         sum += difference;
      }
      variance = Math.sqrt(sum / num_counter);
 
      System.out.printf("%2d %.3f %.3f\n", num_counter, average, variance);
   }
 
   private void homework() {
      int line_counter = 0;
      boolean condition = true;
      while (condition){
         num_counter = 0;
         for (int i = 0; i < 10; i++) {
            if (input.hasNextLine()) {
               line_counter++;
               String line = input.nextLine();
               if (!checkLine(line)) {
                  System.err.println("A number has not been parsed from line " + line_counter);
                  i--;
               } else {
                  double number = Double.parseDouble(line);
                  numbers[i] = number;
                  num_counter++;
               }
            } else {
               System.err.println("End of input detected!");
               if (num_counter > 1) { calcAverageAndVariance(); }
               condition = false;
               break;
            }
         }
         if (condition) {calcAverageAndVariance();}
      }
   }
   public void start(String[] args) {
      if (args.length == 0 || args[0] == "1" || args[0] == "2" || args[0] == "3" || args[0] == "4") {
         homework();
      }
   }
}