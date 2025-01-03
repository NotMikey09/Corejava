package exceptionhandling.exceptionproblems.p10.exception;

@SuppressWarnings("serial")
public class InsufficientFundsException extends Exception {

	public InsufficientFundsException(String errorMessage)
	{
		super(errorMessage);
	}
}
