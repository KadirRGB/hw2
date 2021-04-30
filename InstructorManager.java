package hwThree;

public class InstructorManager extends UserManager{
	public InstructorManager(String code) {
		logIn(code);
	}
	public void addCourse(String courseName) {
		System.out.println("Course added! " + courseName);
	}
	public void updateCourse(String courseName) {
		System.out.println("Course updated! "+ courseName);
	}
	public void removeCourse(String courseName) {
		System.out.println("Course removed! "+ courseName);
	}
	
}
