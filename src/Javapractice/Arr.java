package Javapractice;

import java.util.ArrayList;
import java.util.Iterator;
class Abdc {
	int a,b ; String c;
	public Abdc(int a,int b,String c) {
		this.a = a;
		this.b = b;
		this.c = c;	
	}
}
public class Arr {
	
	
	public static void main(String[] args) {
		Abdc A = new Abdc(1,2,"String");
		Abdc B = new Abdc(3,4, "Array");
		Abdc C = new Abdc(5,6, "Char");
		Abdc D = new Abdc(7,8, "Boolean");
		ArrayList<Abdc> Al = new ArrayList<Abdc>();
		Al.add(A);
		Al.add(B);
		Al.add(C);
		Al.add(D);
		System.out.println(Al);
		Iterator I = Al.iterator();
		while(I.hasNext()) {
			Abdc Ab = (Abdc)I.next();
			System.out.println(Ab.a +" " + Ab.b +" "+ Ab.c);
		}
		
		
	}

}
