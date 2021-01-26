/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_pet;
import java.util.Scanner;
/**
 *
 * @author Zemmy
 */
public class Java_Pet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pet_name;
        String full_name;
        int age;
        
        System.out.print("What is the name of your pet?");
        pet_name = input.next();
        
        System.out.print("What is "+ pet_name +"'s age?");
        age = input.nextInt();
        
        System.out.print("What is your full name?");
        full_name = input.next();
        
        System.out.println(" "+ full_name +" has a pet named "+ pet_name +" that is "+ age +" years old.");
        // TODO code application logic here
    }
    
}
