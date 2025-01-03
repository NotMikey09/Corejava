package exceptionhandling.exceptionproblems.p10.exception;

public interface Bank {

	public void deposit(double amount) throws InvalidAmountException;
	public void withdraw(double amount) throws InsufficientFundsException;
	public void transfer(BankAccount toAccount,double amount) throws InsufficientFundsException,AccountNotFoundException,InvalidAmountException;
	public void applyForLoan(double amount) throws LoanNotAllowedException;
	 double getBalance();
	
}
