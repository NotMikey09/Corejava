package exceptionhandling.exceptionproblems.p6.exception;

public class ChildClass extends ParentClass {

	public static void main(String[] args) {
		ChildClass child=new ChildClass();
		try{
			child.loadingClass(args[0]);
		}
		catch(IllegalArgumentException i)
		{
			System.out.println(i.getMessage());
			i.printStackTrace();
		}
	}
	
	@Override
	public void loadingClass(String name) {
		if(name.length()==0)
		{
			throw new IllegalArgumentException("Class name cannot be empty");
			}
		}

}

