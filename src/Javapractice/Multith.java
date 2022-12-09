package Javapractice;

class Seconthread extends Thread {
	int j;
	int i;
	int k = 89;

	public void run() {

		for (j = 0; j <= 5; j++) {
			System.out.println(j);
		}

		if (k > 0) {
			System.out.println(k);
		} else {
			System.out.println("Invalid");
		}
		for (i = 6; i <= 10; i++) {
			System.out.println(i);
		}

	}
}

public class Multith {

	public static void main(String[] args) {

		Seconthread F1 = new Seconthread();
		Seconthread F2 = new Seconthread();
		Seconthread F3 = new Seconthread();

		// F.start();
		F1.start();
		F2.start();
		F3.start();

	}

}
