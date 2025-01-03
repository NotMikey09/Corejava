package exceptionhandling.exceptionproblems.p10.exception;

@SuppressWarnings("serial")
public class LoanNotAllowedException extends RuntimeException{
	public LoanNotAllowedException(String errorMessage)
	{
		super(errorMessage);
	}
}
