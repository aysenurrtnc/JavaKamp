
public class Course {
	private int id;
	private int instructorId;
	private String courseName;
	private String courseDescription;
	
	public Course(int id, int instructorId, String courseName, String courseDescription) {
		super();
		this.id = id;
		this.instructorId = instructorId;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescriptionString() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	
	
	
	
	

}
