package exceptionhandling.exceptionproblems.p9.exception;

public class CarTest {
	
	public static void stop(String str) throws CarStoppedException
	{
		if(str.equalsIgnoreCase("Stop"))
		{
			throw new CarStoppedException("Car stopped due to some abnormal reason.!!");
		}
		else
		{
			System.out.println("Gear up,Belts On!!! Your car is moving!!");
		}
	}
	
	public static void puncture(String str) throws CarPunctureException
	{
		if(str.equalsIgnoreCase("puncture"))
		{
			throw new CarPunctureException("Car is punctured.!!");
		}
		else
		{
			System.out.println("Car not punctured.");
		}
			
	}
	public static void carHeat(int carHeat) throws CarHeatException
	{
		if(carHeat > 50)
		{
			throw new CarHeatException("Car is heated more than 50 degrees Celsius.!! Your car is Stalled");
			
		}
		else
		{
			System.out.println("Car temperature normal.!! Car not Stall");
		}
	}
}
