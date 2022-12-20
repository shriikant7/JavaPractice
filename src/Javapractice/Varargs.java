package Javapractice;

public class Varargs {
	void a(int c) {
	System.out.println(c);	
	}
	void a(int...f ) {
		System.out.println("var"+ f.hashCode());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Varargs V = new Varargs();
        V.a();
	}

}
