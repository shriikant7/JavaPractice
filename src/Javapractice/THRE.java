package Javapractice;

class THRE2 {
	public void Hii(int seat) {
		System.out.println("Execute task 2" + seat);
	}
}

public class THRE extends Thread {
	int sat;
	THRE2 TH = new THRE2();

	public void run() {
		TH.Hii(sat);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		THRE T = new THRE();
		T.sat = 23;
		T.start();

	}

}
