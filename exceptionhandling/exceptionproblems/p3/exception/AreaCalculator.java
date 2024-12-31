package exceptionhandling.exceptionproblems.p3.exception;

import java.util.Scanner;

public class AreaCalculator {
	
	public static double calculateArea(double length,double width) throws IllegalArgumentException
	
	{ 
		if(length<0 || width<0)
		{
			throw new IllegalArgumentException();
		}
		else {
		return length*width;
		}
		
	}

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter the length of the rectangle:");
			double length=sc.nextDouble();
			System.out.println("Enter the width of the rectangle:");
			double width=sc.nextDouble();
			System.out.println("Area is: "+calculateArea(length, width));
		}
		catch (IllegalArgumentException e) {
			System.err.println("Negative value entered!!!");
			e.printStackTrace();
		}
		
		

	}

}
