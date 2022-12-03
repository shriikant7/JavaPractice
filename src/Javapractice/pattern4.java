package Javapractice;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
		int k;
		int l;
		for (i = 1; i <= 4; i++) {
			for (j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= i; k++) {
				System.out.print("*");
			}

			System.out.println("");

		}

	}

}
