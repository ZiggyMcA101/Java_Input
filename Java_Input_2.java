/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_input_2;
import java.util.Scanner;
/**
 *
 * @author Zemmy
 */
public class Java_Input_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word1;
        String word2;
        
        System.out.print("Give me a random word!");
        word1 = input.next();
        
        System.out.print("Give me another word!");
        word2 = input.next();
        
        System.out.println("Great, now your favorite number?");
        System.out.println("45");
        System.out.println("And your second-favorite number...");
        System.out.println("1");
        
        System.out.println("Thank you!");
        // TODO code application logic here
    }
    
}
