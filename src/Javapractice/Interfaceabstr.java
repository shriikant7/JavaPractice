package Javapractice;
interface Avoid{
	void anna();
	void an();
}
class Avoidn implements Avoid{
	public void anna() {
		System.out.println("hi");
	}
	public void an() {
		System.out.println("yes");
	}
}
public class Interfaceabstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avoidn A = new Avoidn();
		A.an();
		A.anna();

	}

}
