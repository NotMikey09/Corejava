package exceptionhandling.exceptionproblems.p7.exception;

public class CommandLineDivision {
	public static void main(String[] args)  {
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		try {
			try {
				System.out.println("Division Result :"+a/b);
				
			}
			catch(ArithmeticException am)
			{
				System.out.println(am.getMessage());
			}
			finally {
				System.out.println("Division operation completed");
			}
			
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
		}
		catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

}
