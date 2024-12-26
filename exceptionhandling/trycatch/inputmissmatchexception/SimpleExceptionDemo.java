package exceptionhandling.trycatch.inputmissmatchexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo
{
    public static void main(String[] args)
    { 
    	//Handling error with try and catch
        try
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter secound number:");
        int b=sc.nextInt();
        sc.close();
        }
        catch(InputMismatchException e) //here the wrong input will throw respective exception object to catch block
        {
           System.out.println("An InputMismatchException occured");
           System.out.println("Error: " + e.getMessage()); // Using getMessage()
           System.out.println("Stack Trace:");
           e.printStackTrace(); // Using printStackTrace() 
           System.out.println("Error Message: " + e); // Using toString()
           System.out.println("String representation: " + e.toString()); // Using toString() again 
        }
        
        
    }
}