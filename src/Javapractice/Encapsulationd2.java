package Javapractice;
class E2{
	private int a;
	public void setE(int b) {
		this.a = b;
	}
	public int getE() {
		return a;
	}
}
public class Encapsulationd2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E2  e = new E2();
		e.setE(9);
		int c = e.getE();
		System.out.println(c);
		
		
	}

}
