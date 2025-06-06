package Project;

import java.util.LinkedList;
import java.util.Queue;

public class IceCreamEx {

	public static void main(String[] args) {
		Queue<String> kids=new LinkedList<String>();
		kids.add("ram");
		kids.add("ravi");
		kids.add("latha");
		kids.add("krish");
		kids.add("khana");
		System.out.println(kids);
		System.out.println("first kid:"+kids.peek());
		System.out.println("first kidis being served:");
		String firstOut=kids.remove();
		System.out.println(firstOut);
		kids.add("jai");
		System.out.println(kids);
	}
}
