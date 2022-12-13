package Javapractice;
interface Noid{
	 void No();
	 void Nooo();
	void Nei() ;
	
}


public class Japr implements Noid{
	Japr(int a){
		System.out.println("Constr" + a);
	}
	void No() {
		System.out.println("hi");
	}
	void Nooo() {
		System.out.println("Hjj");
	}
	void nei() {
		System.out.println("kjk");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Japr J = new Japr(3);
		J.Nei();
		J.No();
		J.Nooo();
		
		
	}

}
