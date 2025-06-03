package devi;

import java.util.TreeMap;

public class TreeMapExamle {
	public static void main(String[] args) {
		TreeMap<Integer,String> stulist=new TreeMap<Integer,String>();
		stulist.put(50,"ram");
		stulist.put(60,"latha");
		stulist.put(10,"ravi");
		stulist.put(70,"raju");
		stulist.put(20,"hari");
		stulist.put(30,"kamala");
		stulist.put(80,"jyo");
		System.out.println(stulist);
		stulist.remove(70);
		System.out.println(stulist);
		
	}

}



