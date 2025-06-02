package project10;

import java.util.HashMap;

public class StudentHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> studentMap = new HashMap<Integer,String>();
		studentMap.put(1,"kamal");
		studentMap.put(2,"latha");
		studentMap.put(3,"kamal");
		studentMap.put(4,"jai");
		studentMap.put(5,"malini");
		studentMap.put(5, "teja");
		studentMap.put(7, "raju");
		System.out.println(studentMap);



	}

}
