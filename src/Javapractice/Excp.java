package Javapractice;

import java.util.Scanner;



public class Excp extends Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			double TotalBalance = 40000;
			Scanner S = new Scanner(System.in);
			System.out.println("Enter the amount to withraw :");
			double Withraw = S.nextDouble();

			if (Withraw <= TotalBalance) {

				double Remain = TotalBalance - Withraw;
				System.out.println("Withdrawal is successful");
				System.out.println("Withdrawal Amount :" + Withraw);
				System.out.println("Remaining Balance :" + Remain);

				// throw new Atm("No S");
			} else {
				System.out.println("Amount Insufficient");
			}

		} catch (Exception E) {
			System.out.println(E);
		}
		System.out.println("hi");

	}

}
