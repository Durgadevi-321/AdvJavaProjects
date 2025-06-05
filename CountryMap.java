package Project;

import java.util.TreeMap;

public class CountryMap {

	public static void main(String[] args) {
		TreeMap<String,String> country=new TreeMap<String,String>();
		country.put("india", "newdelhi");
		country.put("usa", "washington");
		country.put("germany", "berlin");
		country.put("japan", "tokyo");
		country.put("india", "delhi");
		System.out.println(country);
		System.out.println(country.firstEntry());
		System.out.println(country.lastEntry());
		System.out.println(country.higherEntry("india"));
		System.out.println(country.lowerEntry("india"));

	}

}
