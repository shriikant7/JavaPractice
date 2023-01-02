package Javapractice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicatedatafindingusingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l = new ArrayList();
		l.add(2);
		l.add(2);
		l.add(3);
		l.add(1);
		l.add(8);
		l.add(8);
		System.out.println(l);
		
		Set S = new LinkedHashSet(l);
		System.out.println(S);

	}

}
