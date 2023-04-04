/*
 * File name: Start.java
 * Date:      2014/09/04 12:34
 * Author:    @lubiku
*/

package cz.cvut.fel.pjv;
 
import java.util.Scanner;
 
public class Lab01 {
 
   private void homework() {
      Scanner input = new Scanner(System.in);
 
      System.out.println("Vyber operaci (1-soucet, 2-rozdil, 3-soucin, 4-podil):");
      int user_choice = input.nextInt();
 
      double x;
      double y;
      double result = 0;
      int decimal;
      String output;
      String formating_str = "%.";
      String operation;
 
      switch (user_choice) {
         case 1:
            operation = " + ";
            System.out.println("Zadej scitanec: ");
            x = input.nextDouble();
            System.out.println("Zadej scitanec: ");
            y = input.nextDouble();
            System.out.println("Zadej pocet desetinnych mist: ");
            decimal = input.nextInt();
            if (decimal < 0) {
               System.out.println("Chyba - musi byt zadane kladne cislo!");
               return;
            } else {
               String str_decimal = String.valueOf(decimal);
               formating_str = formating_str + str_decimal + "f";
            }
            result = x + y;
            output = formating_str + operation + formating_str + " = " + formating_str + "\n";
            System.out.printf(output, x, y, result);
            break;
         case 2:
            operation = " - ";
            System.out.println("Zadej mensenec: ");
            x = input.nextDouble();
            System.out.println("Zadej mensitel: ");
            y = input.nextDouble();
            System.out.println("Zadej pocet desetinnych mist: ");
            decimal = input.nextInt();
            if (decimal < 0) {
               System.out.println("Chyba - musi byt zadane kladne cislo!");
               return;
            } else {
               String str_decimal = String.valueOf(decimal);
               formating_str = formating_str + str_decimal + "f";
            }
            result = x - y;
            output = formating_str + operation + formating_str + " = " + formating_str + "\n";
            System.out.printf(output, x, y, result);
            break;
         case 3:
            operation = " * ";
            System.out.println("Zadej cinitel: ");
            x = input.nextDouble();
            System.out.println("Zadej cinitel: ");
            y = input.nextDouble();
            System.out.println("Zadej pocet desetinnych mist: ");
            decimal = input.nextInt();
            if (decimal < 0) {
               System.out.println("Chyba - musi byt zadane kladne cislo!");
               return;
            } else {
               String str_decimal = String.valueOf(decimal);
               formating_str = formating_str + str_decimal + "f";
            }
            result = x * y;
            output = formating_str + operation + formating_str + " = " + formating_str + "\n";
            System.out.printf(output, x, y, result);
            break;
         case 4:
            operation = " / ";
            System.out.println("Zadej delenec: ");
            x = input.nextDouble();
            System.out.println("Zadej delitel: ");
            y = input.nextDouble();
            if (y == 0) {
               System.out.println("Pokus o deleni nulou!");
               return;
            }
            System.out.println("Zadej pocet desetinnych mist: ");
            decimal = input.nextInt();
            if (decimal < 0) {
               System.out.println("Chyba - musi byt zadane kladne cislo!");
               return;
            } else {
               String str_decimal = String.valueOf(decimal);
               formating_str = formating_str + str_decimal + "f";
            }
            result = x / y;
            output = formating_str + operation + formating_str + " = " + formating_str + "\n";
            System.out.printf(output, x, y, result);
            break;
         default:
            System.out.println("Chybna volba!");
            return;
      }
 
 
   }
   public void start(String[] args) {
     homework();
   }
}