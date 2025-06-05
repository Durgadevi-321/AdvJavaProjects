package Project;

import java.util.TreeSet;

public class EmployeeNames {

	public static void main(String[] args) {
		TreeSet<String> employee=new TreeSet<String>();
		employee.add("sumit");
		employee.add("karan");
		employee.add("Anjali");
		employee.add("mohan");
		employee.add("zoya");
		System.out.println(employee.descendingSet());

	}

}
