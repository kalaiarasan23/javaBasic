package Assignment1;

public class Teacher {
	
	
	public static void main(String[] args) {
		School teacher = new School();
		teacher.conduct_exams();
		teacher.publishResults(75);
		
	System.out.println(School.school_name);
	//System.out.print(teacher.salary);
	//the field teacher.salary cannot be visible
	}

}
