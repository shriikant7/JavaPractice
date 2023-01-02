package Javapractice;

import java.util.LinkedHashMap;
import java.util.Set;

public class linkedhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap L1  = new LinkedHashMap();
		L1.put("aArrr", 3444);
		L1.put("fgh", 44);
		
		LinkedHashMap LHM  = new LinkedHashMap();
		LHM.put("string", 3);
		LHM.put("char", 5);
		LHM.put("boolean", 4);
		LHM.put("float", 0);
		LHM.put("double", 3);
		LHM.putAll(L1);
		System.out.println(LHM);
		//Set S  = LHM.entrySet();
		

	}

}
