package exceptionhandling.exceptionproblems.p2.exception;


public class ClassCastException {

public static void handleClassCastException() { 
	Object[] object={"Hello",123,"Pratyush"};

	for(Object ob:object)
{
	try {
		String str = (String) ob;
		System.out.println("Casting Successfull: "+str);
	}
	catch(Exception e)
	{
		System.err.println("Object missmatched!!!");
		e.printStackTrace();
	}
	}
    

}
	
 public static void main(String[] args) {
		
	
		 handleClassCastException();
	 
		

	}

}
