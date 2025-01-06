package exceptionhandling.exceptionproblems.p11.exception;

public class InvalidProductException extends RuntimeException{

	public InvalidProductException(String errorMessage) {
		super(errorMessage);
	}

}
