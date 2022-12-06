package Javapractice;

import java.util.Scanner;

public class Trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner Sc = new Scanner(System.in);
			int A = Sc.nextInt();
			int B = Sc.nextInt();
			
			System.out.println(A/B);
			
		}
		catch(Exception aa) {
			//System.out.println(aa);
			System.out.println("Not executed");
		}
		finally{
			System.out.println("Printed value");
		}

	}

}
