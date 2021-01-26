/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_input_.pkg1;
import java.util.Scanner;
/**
 *
 * @author Zemmy
 */
public class Java_Input_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);      
        
        System.out.print("How old are you?");
        int age = input.nextInt();
        
        System.out.print("How tall are you?");
        int height = input.nextInt();

        System.out.print("How much do you weigh?");
        int weight = input.nextInt();
        
        System.out.println("So you're " + age + " years old," + height + " tall and " + weight + " heavy.");
        // TODO code application logic here
    }
    
}
