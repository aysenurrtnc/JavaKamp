
public class Instructor extends User {
	
	private int instructorId;
	private int givenCourseId;
	
	
	public Instructor(int userId, String firstName, String lastName, String email, String password, int instructorId, int givenCourseId) 
	{
		super(userId, firstName, lastName, email, password);
		this.instructorId = instructorId;
		this.givenCourseId = givenCourseId;
	}


	public int getInstructorId() {
		return instructorId;
	}


	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}


	public int getGivenCourseId() {
		return givenCourseId;
	}


	public void setGivenCourseId(int givenCourseId) {
		this.givenCourseId = givenCourseId;
	}
	
	
	
	
	
	
	
	

}
