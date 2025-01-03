package exceptionhandling.exceptionproblems.p10.exception;

@SuppressWarnings("serial")
public class InvalidAmountException extends RuntimeException {

	  public InvalidAmountException(String errorMessage)
	  {
		  super(errorMessage);
	  }
}
