package Javapractice;

import java.util.Scanner;

public class Allinone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a = 16; String A = ((a<12)?"Condition true": "false");
		 * System.out.println(A);
		 */
		/*
		 * int a = 23; if(a<23) { System.out.println("GM"); } else if(a<24) {
		 * System.out.println("GA"); }else { System.out.println("GN"); }
		 */
/////////////////////////////////////////////
		/*
		 * for (int i = 1; i <= 2; i++) { System.out.println("Outer: " + i); // Executes
		 * 2 times
		 * 
		 * // Inner loop for (int j = 1; j <= 3; j++) { System.out.println(" Inner: " +
		 * j); // Executes 6 times (2 * 3)
		 * 
		 * } } for(int k =0; k<=2; k++) { System.out.println(k); for(int l=10 ; l<=12;
		 * l++) { System.out.println(l); } }
		 */
		////////////////////////////////////////////

		/*
		 * int arr[] = {1,2,3,4,5}; int j=0; for(int i : arr) {
		 * 
		 * j = j+i; System.out.println(j); System.out.println("Hello"); }
		 * System.out.println(j);
		 */
		//////////////
		/*
		 * char ch[] = { 'c', 'd', 'e', 'f'}; for(int a=0 ; a < ch.length; a++) {
		 * System.out.println(ch[a]); } System.out.println(ch);
		 */
		/////////////
		/*
		 * int h[]= { 1,2,3,4,5,6}; for(int a : h) { System.out.println(a); } for(int
		 * a=0; a < h.length ; ++a) { System.out.println(h[a]); }
		 */
		///////////////
		/*int Total = 20;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter The number 1 :");
		int a = S.nextInt();
		while (a > 0) {
			Total = Total + a;
			System.out.println("Total* :" +Total);
			System.out.println("Enter The number 2 : ");
			a = S.nextInt();
			//Total = Total + a;
			//System.out.println("Total 2 :" + Total);

		}
		//a = S.nextInt();
		Total = Total + a;
		System.out.println("Final " + Total);*/
		/////////////////////
		/*int Total = 10;
		Scanner S  = new Scanner(System.in);
		System.out.println("Enter :");
		int A = S.nextInt();
		do {
			Total = Total + A;
			System.out.println( "Total is" + Total);
			A= S.nextInt();
		}while(A<7 && A>0);
		System.out.println("Final : " + Total);*/

	}

}
