package inheritance2;

public class InstructorManager extends UserManager {
	
	public void createCourse(String courseName) {
		System.out.println("Kurs ba�ar�yla eklendi!");
	}
    
	public void getAllCourses(Instructor instructor) {
		for (int i=0;i<instructor.getCourses().length;i++) {
			System.out.println("Kurs " + (i+1) + " = " + instructor.getCourses()[i]);
		}
	}
	
	public void getAllStudents(Instructor instructor) {
		for (int i=0;i<instructor.getStudents().length;i++) {
			System.out.println("��renci " + (i+1) + " = " + instructor.getStudents()[i]);
		}
	}
}
