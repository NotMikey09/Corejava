package collection.programs.p1;

public class CabCustomerServiceTester {
	public static void main(String[] args) {
		
		CabCustomerService service=new CabCustomerService();
		CabCustomer customer1= new CabCustomer(101, "Pratyush", "Ameerpeth", "Secundarabad", 6, "98765432");
		CabCustomer customer2=new CabCustomer(102,"Abhay","Begumpet", "Ameerpeth", 3, "12345678");
		service.addCabCustomer(customer1);
		service.addCabCustomer(customer2);
		System.out.println();
		System.out.println("*****BILL*****");
		service.printBill(customer1);
		System.out.println();
		System.out.println("*****BILL*****");
		service.printBill(customer2);
	}

}
