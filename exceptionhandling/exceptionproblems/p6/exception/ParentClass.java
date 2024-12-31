package exceptionhandling.exceptionproblems.p6.exception;

public class ParentClass {
	
	public void loadingClass(String name)
	{
		try {
			Class.forName(name);
		}
		catch(ClassNotFoundException c)
		{
			System.err.println("Class Not Found!!");
		}
	}

}
