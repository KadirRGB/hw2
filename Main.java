package hwThree;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.setId(12);
		instructor.setName("Engin");
		String codeI =instructor.getInstructorCode();
		
		Student student = new Student();
		student.setId(15);
		student.setName("Kadir");
		String codeS = student.getStudentCode();
		
		InstructorManager instructorManager = new InstructorManager(codeI);
		instructorManager.addCourse("java");
		
		StudentManager studentManager = new StudentManager(codeS);
		studentManager.joinCourse();
	
	}

}
