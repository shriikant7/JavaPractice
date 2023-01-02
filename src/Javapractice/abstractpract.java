package Javapractice;
abstract class Ab{
	abstract void anna();
	void an() {
		System.out.println("hii");
	}
}

public class abstractpract extends Ab   {
	 void anna() {
		 System.out.println("hi");
	 }

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		abstractpract a = new abstractpract();
		a.an();
		a.anna();
		
		
		

	}

}
