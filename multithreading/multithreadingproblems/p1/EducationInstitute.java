package multithreading.multithreadingproblems.p1;

public class EducationInstitute {
	private Course[] courses;
	private Offer[] offers;
	private int count;
	
	public EducationInstitute(Course[] courses, Offer[] offers) {
		super();
		this.courses = courses;
		this.offers = offers;
	}

	public Course[] getCourses() {
		return courses;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Offer[] getOffers() {
		return offers;
	}
	
	public void enrollStudentCourse(int courseId,String studentName)
	{
		for(int i=0;i<courses.length;i++)
		{
			if(courseId==courses[i].getCourseId())
			{
				System.out.println(studentName +" enrolled in : "+courses[i].getCourseName());

			}
		}
		
	}

}
