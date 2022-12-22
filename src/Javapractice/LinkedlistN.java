package Javapractice;

import java.util.Iterator;
import java.util.LinkedList;

class N1{
	int a,b;
	String c;
	public N1(int a, int b, String c) {
		this.a = a;
		this.b= b;
		this.c= c;
		System.out.println(a +" "+ b+ " "+ c);
	}
}
public class LinkedlistN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N1 n1 = new N1(1,2, "String");
		N1 n2 = new N1(3,4, "Char");
		N1 n3 = new N1(5,6, "int");
		N1 n4 = new N1(7,8, "Array");
		
		LinkedList LL = new LinkedList();
		LL.add(n1);
		LL.add(n2);
		LL.add(n3);
		LL.add(n4);
		System.out.println(LL);
		Iterator i = LL.iterator();
		while(i.hasNext()) {
			N1 NN = (N1)i.next();
			System.out.println(NN.a+ " "+ NN.b+" "+ NN.c);
		}
	}

}
