package Javapractice;

interface Avoid {
	void anna();

	void an();
}

public class Interfaceabstr implements Avoid {
	public void anna() {
		System.out.println("hi");
	}

	public void an() {
		System.out.println("yes");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaceabstr A = new Interfaceabstr();
		A.an();
		A.anna();

	}

}
