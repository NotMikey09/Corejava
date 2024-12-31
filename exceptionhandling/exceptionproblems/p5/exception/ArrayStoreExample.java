package exceptionhandling.exceptionproblems.p5.exception;

public class ArrayStoreExample {
	
	public static void storeObjects()
	{
		Object object[]= {"Hello","Pratyush",123};
		for(Object ob:object)
		{
			if(!(ob instanceof String))
			{
				throw new ArrayStoreException("java.lang.Integer cannot be stored in an array of java.lang.String\r\n"
						);
			}
			
		}
	   
	}

	public static void main(String[] args) {
		
		
try {
	storeObjects();
}
catch(ArrayStoreException a)
{
	System.err.println(a+a.getMessage());
	}
		
	}

}
