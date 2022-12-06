package Javapractice;

class ABC extends Exception {
	public ABC() {
		super("Hiii");
	}
}

class Def {
	public static void ages(int aged) throws ABC {
		if (aged < 18) {
			throw new ABC();
		} else {
			System.out.println("Yes");
		}

	}

}

public class ATMwiththrow extends Def {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Def S = new Def();

		try {
			ages(19);
		} catch (Exception a) {
			System.out.println(a);

		}
	}

}
