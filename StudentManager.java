package hwThree;

public class StudentManager extends UserManager{
	public StudentManager(String code) {
		logIn(code);
	}
	public void joinCourse() {
		System.out.println("Joined to course");
	}
	public void leaveCourse() {
		System.out.println("left to course");
	}
	
}
