package exceptionhandling.exceptionproblems.p1.exception;

import java.util.Scanner;

public class DivisionExample {
	
	public static int performDivision(int a, int b) throws ArithmeticException
	{
		return a/b;
	}

	public static void main(String[] args) {
		
	
		try (	Scanner sc = new Scanner(System.in))
		{  
			System.out.println("Enter the first integer: ");
			int a=sc.nextInt();
			System.out.println("Enter the Secound integer: ");
			int b=sc.nextInt();
			System.out.println("Result :"+performDivision(a, b));
		}
		catch(ArithmeticException a)
		{ 
			System.err.println("Invalid Input!! Cannot divided by zero!!!!");
			System.out.println("Error message:"+ a);
			
		}
       
	}

}
