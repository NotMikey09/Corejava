package multithreading.multithreadingproblems.p1;

public class Student {
	String name;
	EducationInstitute institute;

	public Student(String name, EducationInstitute institute) {
		super();
		this.name = name;
		this.institute = institute;			
	}
	
	public void viewCoursesAndFees()
	{
		Course[] courses=institute.getCourses();
		for(Course course : courses)
		{
			 System.out.println(course.getCourseId()+" : "+course.getCourseName()+" : "+course.getCourseFee());

		}
	}
	public void viewOffers()
	{
		Offer[] offers=institute.getOffers();
		for(Offer offer: offers)
		{
			System.out.println(offer.getOfferText());
		}
	}
	
	  public void enrollInCourse(int courseId)
	  {
		  institute.enrollStudentCourse(courseId, name);
	  }

	  
}