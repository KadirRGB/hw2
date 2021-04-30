package hwThree;

public class Student extends User {
	
	public String getStudentCode() {
		return getName().substring(0,2) + getId();
	}

	
}
