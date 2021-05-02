
public class Student extends User {
	
	private int studentId;
	private int courseId;
	
	
	public Student(int userId, String firstName, String lastName, String email, String password, int studentId,int courseId) 
	{	
		super(userId, firstName, lastName, email, password);
		this.studentId = studentId;
		this.courseId = courseId;
	}
	
	
	
	
	
	
	
	
	

}
