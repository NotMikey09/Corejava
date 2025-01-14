package multithreading.multithreadingproblems.p1;

public class StudentMain {


	public static void main(String[] args) throws InterruptedException 
	{
		Course [] course = {new Course(1, "Java", 29000),new Course(2, ".Net", 25000), new Course(3, "Python", 27000)};
		Offer [] offer = {new Offer("Special discount: Get 20% off on all courses!"), new Offer("Limited time offer: Enroll in any two courses and get one course free!")};
		EducationInstitute ei = new EducationInstitute(course, offer);
		
		Student john = new Student("John",ei);
		Student alice = new Student("Alice",ei);
		
		Thread t1 = new Thread()
				{
			      @Override
			      public void run()
			      {
			    	  System.out.println("Available Courses and Fees :");
				    	 john.viewCoursesAndFees();
				    	 System.out.println("Available Offers :");
				    	 john.viewOffers();
				    	 john.enrollInCourse(1);
				    	 	 
			      }
				};
				
		Thread t2 = new Thread()
		{
	      @Override
	      public void run()
	      {
	    	 System.out.println("Available Courses and Fees :");
		     alice.viewCoursesAndFees();
		     System.out.println("Available Offers :");
		     alice.viewOffers();
	    	 alice.enrollInCourse(3);
	    	  
	      }
		};
		t1.start();
		t1.join();
		System.out.println(".....................");
		System.out.println();
        t2.start();	
	}

}
