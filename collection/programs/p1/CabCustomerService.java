package collection.programs.p1;

import java.util.*;

public class CabCustomerService 
{
	
	private ArrayList<CabCustomer> custum=new ArrayList<CabCustomer>();
	
	
	public CabCustomerService() {
		super();
		//this.custum = custum;
	}

	public void addCabCustomer(CabCustomer customer)
	{   
		if(isFirstCustomer(customer))
		custum.add(customer);
	}

	public boolean isFirstCustomer(CabCustomer customer)
	{
		
		for (CabCustomer cust : custum) 
		{
			if(cust.getPhone().equals(customer.getPhone()))
	         return false;
					}
		
		return true;
	}
	
 public int calculateBill(CabCustomer customer)
 {   
	 
	 
	 if(isFirstCustomer(customer))
	 {
		 custum.add(customer);
		 return 0; 
	 }
	 else if(customer.getDistnce()<=4)
	 {
		 return 80; 
	 }
	 else {
		 return 80+(customer.getDistnce()-4)*6;
	 }
		 
	 
	
}
 public void printBill(CabCustomer customer)
 {
	 System.out.println("Your Cab Bill is: "+calculateBill(customer));
 }
}

