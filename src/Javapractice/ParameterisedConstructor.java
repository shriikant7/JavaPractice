package Javapractice;

public class ParameterisedConstructor {
	public  ParameterisedConstructor(int a) {
		System.out.println(a);
	}
	void abd() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ParameterisedConstructor P = new  ParameterisedConstructor(7);
	
		 System.out.println(P);
	}

}
