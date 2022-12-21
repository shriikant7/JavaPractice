package Javapractice;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class NewArr {
	int a, b;
	String c;

	public NewArr(int a, int b, String c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
}

public class LinkedLis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewArr N = new NewArr(1, 2, "String");
		NewArr N1 = new NewArr(3, 4, "Array");
		NewArr N2 = new NewArr(5, 6, "char");
		NewArr N3 = new NewArr(7, 8, "boolean");

		LinkedList<NewArr> L = new LinkedList<NewArr>();
		L.add(N);
		L.add(N1);
		L.add(N2);
		L.add(N3);

		Iterator i = L.iterator();

		while (i.hasNext()) {
			NewArr NN = (NewArr) i.next();
			System.out.println(NN.a + " " + NN.b + " " + NN.c);
		}

	}

}
