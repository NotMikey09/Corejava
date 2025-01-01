package exceptionhandling.exceptionproblems.p9.exception;

@SuppressWarnings("serial")
public class CarPunctureException extends Exception{

	public CarPunctureException() {
		
	}
	public CarPunctureException(String errorMessage) {
		super(errorMessage);
	}
	
}
