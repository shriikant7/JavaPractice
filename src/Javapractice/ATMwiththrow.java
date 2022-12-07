package Javapractice;

class ABC extends Exception {
	public ABC() {
		super("Hiii");
	}
}

public class ATMwiththrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 9;
		try {
			if (age < 9.8) {
				throw new ABC();
			} else {
				System.out.println("invalid");
			}

		} catch (Exception a) {
			System.out.println(a.getMessage());

		}
	}

}
