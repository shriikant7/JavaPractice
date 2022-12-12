package Javapractice;

class Multiii {
	synchronized static void abc() {
		for (int i = 0; i <= 3; i++) {
			System.out.println(i);
		}
		for (int j = 4; j <= 7; j++) {
			System.out.println(j);
		}
	}

	void def() {

		for (int k = 8; k <= 11; k++) {
			System.out.println(k);
		}

		for (int l = 12; l <= 15; l++) {
			System.out.println(l);
		}
	}

	void ghi() {
		for (int m = 16; m <= 19; m++) {
			System.out.println(m);
		}

		for (int n = 20; n <= 23; n++) {
			System.out.println(n);
		}

	}

}

class Abd extends Thread {
	Multiii M = new Multiii();

	public void run() {
		M.abc();
		M.def();
		M.ghi();
	}
}

public class Intv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abd A = new Abd();
		A.start();
		Abd A2 = new Abd();
		A2.start();

	}

}
