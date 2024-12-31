package exceptionhandling.exceptionproblems.p8.exception;

import java.util.Scanner;

public class FinancialTransaction {

  public static void processTransaction(double amount, long accountNumber) {
    if (amount <=0 || accountNumber <=0) {
      throw new IllegalArgumentException("Invalid amount or account number. Please enter positive values only.");
    }
    System.out.println("Transaction Successful: Amount " + amount + " transferred");
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    try (sc) {
    System.out.println("Enter the amount to transfer followed by account number:");
      double amount = sc.nextDouble();
      long accountNumber = sc.nextLong();
      System.out.println("Transaction Processing....");
      processTransaction(amount, accountNumber);
    } 
    catch (NumberFormatException e) 
    {
      System.err.println("Invalid input. Please enter a valid number for amount and account number!!!");
    } 
    catch (IllegalArgumentException e)
    {
      System.err.println("Amount and Account Number should be greaer than 0");
    }
    catch (RuntimeException e) {
    	System.err.println("Runtime exception occured");
		e.printStackTrace();
	
	}
  }
}