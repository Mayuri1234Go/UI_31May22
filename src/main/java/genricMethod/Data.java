package genricMethod;

import java.util.HashMap;

public class Data {
	
	public static HashMap<String, String> getUserLoginInfo() {

		HashMap<String, String> userMap=new HashMap<String, String>();
		userMap.put("customer", "naveenk_test@123");
		userMap.put("admin", "Admin_admin123");
		
		return userMap;
	}
	
	public HashMap<Integer, String> monthMap()
	{
		HashMap<Integer, String> monthMap=new HashMap<Integer, String>();
		
		monthMap.put(1, "january");
		monthMap.put(2, "feb");
		monthMap.put(3, "march");
		monthMap.put(4, "april");
		monthMap.put(5, "may");
		monthMap.put(6, "june");
		monthMap.put(7, "jully");
		monthMap.put(8, "august");
		monthMap.put(9, "september");
		monthMap.put(10, "oct");
		monthMap.put(11, "Nov");
		monthMap.put(12, "Dec");
		
		return monthMap;
				
	}

}
