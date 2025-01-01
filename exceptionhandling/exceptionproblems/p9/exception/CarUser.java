package exceptionhandling.exceptionproblems.p9.exception;

import java.util.Scanner;

public class CarUser {

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		try(sc)
		{
			System.out.println("Enter your Car Status: ");
			String carStatus=sc.next();
			System.out.println("Enter your car engine temperature: ");
			int carTemperature=sc.nextInt();
			CarTest.stop(carStatus);
			CarTest.puncture(carStatus);
			CarTest.carHeat(carTemperature);
			System.out.println("Happy Riding!");
		}
		catch (CarStoppedException e) {
		System.err.println("Stopped!!"+e);
		}
		catch (CarPunctureException e) {
			System.err.println("Punctured!!"+e);
		}
		catch (CarHeatException e) {
			System.err.println("Stalled!!"+e);
			
		} 
	}

}
