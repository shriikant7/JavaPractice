package Javapractice;

class SS {
	 void abc() {
		
		for (int i = 0; i <= 3; i++) {
			System.out.println(i);
		}

		for (int j = 4; j <= 8; j++) {
			System.out.println(j);
		}

	}

}

class Scr extends Thread {
	SS SSS = new SS();

	public void run() {
		SSS.abc();
	}
}

public class Syncr {

	public static void main(String[] args) {
		Scr S = new Scr();
		S.start();
		Scr S1 = new Scr();
		S1.start();
	}

}
