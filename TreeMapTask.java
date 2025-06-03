package devi;

import java.util.TreeMap;

public class TreeMapTask {

	public static void main(String[] args) {
		TreeMap<Integer,String> stulist=new TreeMap<Integer,String>();
		stulist.put(59,"ram");
		stulist.put(67,"latha");
		stulist.put(98,"ravi");
		stulist.put(70,"raju");
		System.out.println(stulist);
		String searchValue = "ram";
        if (stulist.containsValue(searchValue)) {
            System.out.println("found in TreeMap.");
        } else {
            System.out.println("not found.");
        }
    	TreeMap<String,Long> Phonebook=new TreeMap<String,Long>();
    	Phonebook.put("sarayu", 9877864348l);
        Phonebook.put("ravi", 9845123456l);
        Phonebook.put("anita", 9912345678l);
        Phonebook.put("sam", 9877884348l);
        Phonebook.put("ram", 9845193456l);
        Phonebook.put("devansh", 9912345678l);
    	System.out.println(Phonebook);
    	

	}

}
