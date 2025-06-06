package Project;

import java.util.ArrayList;

public class ArrayListAdventure {

	public static void main(String[] args) {
		ArrayList<String> cartoon=new ArrayList<String>();
		cartoon.add("kushi");
		cartoon.add("hydi");
		cartoon.add("sinchan");
		cartoon.add("doramon");
		cartoon.add("motupatlu");
		cartoon.remove("hydi");
		cartoon.set(2, "beem");
        int i;
		for(i=0;i<cartoon.size();i++){
			System.out.println(cartoon.get(i));
			
		}
    }
}

