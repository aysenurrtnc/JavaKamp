
public class InstructorManager extends UserManager {
	
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + "isimli eğitmen eklendi.");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + "isimli eğitmen silindi.");
	}

}
