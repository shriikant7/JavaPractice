package Javapractice;

import java.util.HashSet;
import java.util.Iterator;

public class Hashh {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		 
		HashSet<String> H = new HashSet<String>();
		H.add("Hello");
		H.add("ss");
		H.add("hfg");
		
		
		
		Iterator i = H.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		for(String k : H) {
			System.out.println(k);
		}
		for(int l =0 ; l<H.size(); l++) {
			System.out.println(H);
		}
		H.forEach(s -> System.out.println(s));
		

	}

}
