package Javapractice;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		System.out.println("Enter Number :");
		int a = S.nextInt();
		if (a / 2 != 0) {
			System.out.println("Prime");

		} else {
			System.out.println("Not prime");
		}

	}

}
