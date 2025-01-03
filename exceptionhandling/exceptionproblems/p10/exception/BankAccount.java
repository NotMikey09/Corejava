package exceptionhandling.exceptionproblems.p10.exception;

public class BankAccount implements Bank{
	private long accountNumber;
	private double balance;
	
	public BankAccount(long accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	@Override
	public void deposit(double amount) throws InvalidAmountException {
		if(amount<=0)
		{
			throw new InvalidAmountException("Invalid amount is entered for any Transacation!!");
		}
		else {
			balance+=amount;
			System.out.println("Deposit Successfully!");
		}
		
	}
	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		
		if(amount>=balance)
		{
			throw new InsufficientFundsException("There are not enough funds for a withdrawal or transfer!!");
		}
		else
		{
			balance-=amount;
			System.out.println("Withdrawal Succesfull!");
		}
	}
	@Override
	public void transfer(BankAccount toAccount, double amount) 
	        throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException {
	    if (amount <= 0) {
	        throw new InvalidAmountException("Invalid amount is entered for any Transaction!!");
	    }
	    if (toAccount == null) {
	        throw new AccountNotFoundException("Account Not Found!!");
	    }
	    if (amount > balance) { 
	        throw new InsufficientFundsException("There are not enough funds for a withdrawal or transfer!!"); 
	    }

	    // Deduct the amount from the current account
	    balance -= amount; 

	    // Add the amount to the recipient account
	    toAccount.deposit(amount); 
	}
	@Override
	public void applyForLoan(double amount) throws LoanNotAllowedException {
	 if(amount>=balance)
	 {
		 throw new LoanNotAllowedException("Loan amount not allowed");
	 }
	 if(amount<=0)
	 {

		 throw new  InvalidAmountException("Invalid amount is entered for any Transacation!!");
	 }
		
	}

	@Override
	public double getBalance() {
		
		return balance;
		
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	
	
	

}
