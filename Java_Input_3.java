/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_input_3;
import java.util.Scanner;
/**
 *
 * @author Zemmy
 */
public class Java_Input_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        int money;
        
        System.out.print("What is your first name?");
        name = input.next();
        
        System.out.print("Hi "+ name +", what is your age?");
        age = input.nextInt();
        
        System.out.print("Wow, "+ age +" is really old! How much do you make a month "+ name +"?");
        money = input.nextInt();
        
        System.out.println("$"+ money +".0 is good money for a "+ age + " year old!!!");
        
        // TODO code application logic here
    }
    
}
