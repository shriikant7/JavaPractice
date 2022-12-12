package Javapractice;

public class try1 extends Exception{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try1 t = new try1();
		try {
			t.try2();
		}catch(Exception E) {
			System.out.println(E);
		}
		

	}
	void try2() {
		try {
			int a=4; int b =0; int c=0;
			int d = a/b;
			System.out.println(d);
		}catch(Exception A) {
			System.out.println(A.getMessage());
		}
		
	}
	

}
