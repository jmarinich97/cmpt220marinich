package cmpt220;
import java.util.ArrayList;
public class Course {
	private String courseName;
	private ArrayList<String> students = new ArrayList<String>();
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		if (numberOfStudents != students.size()) {
			students.add(student);
			numberOfStudents++;
		}
		else {
			ArrayList<String> newArray = new ArrayList<String>();
			for (int i = 0; i < numberOfStudents; i++) {
				newArray = students;
			}
			newArray.set(newArray.size() - 1, student);
			numberOfStudents++;
		}
	}
	
	public ArrayList getStudents() {
		ArrayList<String> students2 = new ArrayList<String>();
		for (int i = 0; i < students.size(); i++) {
			students2.set(i, students.get(i));
		}
		return students2;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void dropStudent(String student) {
		students.remove(student);
		
		
	}
	
	public void clear() {
		students.clear();
	}

}
