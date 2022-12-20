package Javapractice;

public class polyoverloadd1 {
	void abc(String a ) {
	System.out.println("hiii");	
	}
	void abc() {
		System.out.println("hjh");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       polyoverloadd1 p = new polyoverloadd1();
       
       p.abc();
	}

}
