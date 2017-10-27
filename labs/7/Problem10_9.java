package cmpt220;

public class Problem10_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course = new Course("Math");
		course.addStudent("John");
		course.addStudent("Mike");
		course.addStudent("Steve");
		course.dropStudent("John");
		
		// Had trouble with the dropStudent method, so this will throw an exception
		
		/*for (int i = 0; i < course.getNumberOfStudents(); i++) {}
			System.out.println(course.getStudents());
			*/
	}

}
