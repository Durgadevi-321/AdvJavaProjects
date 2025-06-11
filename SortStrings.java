package Project;

import java.util.ArrayList;
import java.util.Collections;

public class SortStrings {

	public static void main(String[] args) {
		ArrayList<String> SortString=new ArrayList<String>();
		SortString.add("Radha");
		SortString.add("Krishna");
		SortString.add("Rama");
		SortString.add("Seetha");
		SortString.add("Ravi");
		SortString.add("Charlie");
		SortString.add("Alice");
		SortString.add("Bob");
		System.out.println(SortString);
		Collections.sort(SortString);
		System.out.println("SortedString:"+SortString);
	}

}
