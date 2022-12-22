package Javapractice;

import java.util.Iterator;
import java.util.Vector;

public class Vector11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		v.add(12);
		v.addElement(34);
		v.addElement("String");
		v.addElement('v');
		System.out.println(v);
		
		for(int i=0 ; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
		Iterator k = v.iterator();
		while() {
			
		}

	}

}
