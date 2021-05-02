
public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(1, "Ayşenur", "Tunç", "aysenur@...", "1234", 1 , 1);
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ", "engin@...", "3456", 1, 1);
		
	
		
		Course course1 = new Course(1, 1, "JAVA + REACT", "Yazılım Geliştirici Kampı");
		
		Course course2 = new Course(2, 1, "C# + ANGULAR", "Yazılım Geliştirici Kampı");
		
		
		User[] users = {student, instructor1};
		
		Student[] students = {student};
		
		Instructor[] instructors = {instructor1};
		
		Course[] courses = {course1, course2};
		
		System.out.println("Kullanıcılar: ");
		for(User user : users) {
			System.out.println(user.getFirstName() + " " + user.getLastName());
		}
		
		System.out.println("Eğitmenler:");
		for(Instructor instructor : instructors) {
			System.out.println(instructor.getFirstName() + " " + instructor.getLastName());
		}
		
		System.out.println("Kurslar:");
		for(Course course : courses) {
			System.out.println(course.getCourseName());
			
		}
		
		StudentManager studentManager = new StudentManager();
		studentManager.delete(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course2);
	}		

}
