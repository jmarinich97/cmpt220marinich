package cmpt220;

public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		if (numberOfStudents != students.length) {
			students[numberOfStudents] = student;
			numberOfStudents++;
		}
		else {
			String[] newArray = new String[numberOfStudents + 1];
			for (int i = 0; i < numberOfStudents; i++) {
				newArray[i] = students[i];
			}
			newArray[newArray.length - 1] = student;
			numberOfStudents++;
		}
	}
	
	public String[] getStudents() {
		String[] students2 = new String[students.length];
		for (int i = 0; i < students.length; i++) {
			students2[i] = students[i];
		}
		return students2;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	// Had trouble with this method
	public void dropStudent(String student) {
		String[] temp = new String[students.length - 1];
		for (int i = 0; i < temp.length; i++) {
			if (students[i].equals(student)) {
				continue;
			}
			else {
				temp[i] = students[i];
			}
		}
		students = temp;
		
	}
	
	public void clear() {
		String[] newArray = new String[1];
		students = newArray;
		numberOfStudents = 0;
	}

}
