package exceptionhandling.exceptionproblems.p9.exception;

@SuppressWarnings("serial")
public class CarHeatException extends Exception {

	public CarHeatException() {
		
	}
	public CarHeatException(String errorMessage) {
		super(errorMessage);
	}

}
