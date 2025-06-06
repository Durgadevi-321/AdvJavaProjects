package Project;
import java.util.ArrayList;
	class Student {
	    String name;
	    int age;
	    int marks;

	    Student(String name, int age, int marks) {
	        this.name = name;
	        this.age = age;
	        this.marks = marks;
	    }
	    }
	public class StudentManagement{
	    public static void main(String[] args) {
	        ArrayList<Student> stuman = new ArrayList<>();

	        stuman.add(new Student("ram", 18, 78));
	        stuman.add(new Student("geetha", 19, 87));
	        stuman.add(new Student("ravi", 17, 67));
	        stuman.add(new Student("sarayu", 16, 86));
	        stuman.add(new Student("kalyani", 20, 97));
	        

	        System.out.println("\nStudents with marks > 80:");
	        for (Student s : stuman) {
	            if (s.marks > 80) {
	                System.out.println(s.name + " scored " + s.marks);
	            }
	        }
	    }
	}