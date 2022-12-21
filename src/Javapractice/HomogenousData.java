package Javapractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class HomogenousData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList A = new ArrayList();
		A.add(99);
		A.add(4);
		A.add(5);
		A.add(789);
		A.add(9);
		A.set(1, 67);

		System.out.println(A);

		Collections.sort(A);
		System.out.println(A);
		Collections.reverse(A);
		System.out.println(A);
		System.out.println(A.get(3));

		for (int i = 0; i < A.size(); i++) {
			System.out.println(A.get(i));
		}
		int j = 0;

		while (j < A.size()) {
			System.out.println(A.get(j));
			j++;
		}

	}

}
