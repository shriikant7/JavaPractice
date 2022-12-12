package Javapractice;

class Thr extends Exception {
	public Thr(String Msg) {
		super(Msg);
	}
}

class Tri {
	void Meth(int a) {
		System.out.println("Hiii" + a);
	}
}

public class Throwss {
	Tri T = new Tri();

	void run() {
		T.Meth(3);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      T.start();
	}

}
