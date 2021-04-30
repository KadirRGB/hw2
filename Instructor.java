package hwThree;

public class Instructor extends User{

	public String getInstructorCode() {
		return getName().substring(1, 3) + getId();
	}

}
