/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_bmi;
import java.util.Scanner;
/**
 *
 * @author Zemmy
 */
public class Java_BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("What is your weight in kilograms: ");
      double weight = sc.nextDouble();
      System.out.print("\nWhat is your height in meters: ");
      double height = sc.nextDouble();
      double BMI = weight / (height * height);
      System.out.print("\nThe BMI is " + BMI + ".");
        // TODO code application logic here
    }
    
}
