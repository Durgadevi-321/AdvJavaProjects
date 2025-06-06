package Project;

import java.util.HashMap;

public class GroceryBasket {

	public static void main(String[] args) {
		HashMap<String,Integer> Grocery=new HashMap<String,Integer>();
		Grocery.put("Apples",40);
		Grocery.put("milk",50);
		Grocery.put("bread", 45);
		Grocery.put("Grapes",67);
		Grocery.put("chips",80);
		int sum = 0;
        for (int value : Grocery.values()) {
            sum += value;
        }
        System.out.println(sum);
        Grocery.replace("milk",50,78);
        Grocery.remove("Grapes",67);
        System.out.println(Grocery);

	}

}
