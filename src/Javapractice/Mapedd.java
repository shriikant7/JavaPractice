package Javapractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapedd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map M= new HashMap();
		M.put("Shrikant", 3);
		M.put("Kailas", 9);
		M.put("Akshay", 0);
		M.put("Dtta", 4);
		M.put("Pranav", 2);
		M.put("Aba", 3);
		//System.out.println(M);
		Set S= M.entrySet();
		Iterator I = S.iterator();
		while(I.hasNext()) {
			System.out.println(I.next());
		}
		Iterator j = S.iterator();
		while(j.hasNext()) {
			Map.Entry K = (Map.Entry)j.next();
			System.out.println(K.getKey());
			System.out.println(K.getValue());
		}

	}

}
