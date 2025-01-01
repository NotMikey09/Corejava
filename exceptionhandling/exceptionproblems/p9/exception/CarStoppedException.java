package exceptionhandling.exceptionproblems.p9.exception;

@SuppressWarnings("serial")
public class CarStoppedException extends Exception {

	public CarStoppedException() {
		
	}

	public CarStoppedException(String errorMessage) {
		super(errorMessage);
	}
	
}
