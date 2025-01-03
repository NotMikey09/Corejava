package exceptionhandling.exceptionproblems.p10.exception;

@SuppressWarnings("serial")
public class AccountNotFoundException extends Exception {
	public AccountNotFoundException(String errorMessage)
	{
		super(errorMessage);
	}

}
