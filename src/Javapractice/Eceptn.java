package Javapractice;

class Exchg extends Exception {
	public Exchg() {
		super("Msg");
	}
}

public class Eceptn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 17;
		try {
			if (age < 18) {
				throw new Exchg();
				//System.out.println("not eligible");
				
			} else {
				System.out.println("Eligible");
			}
		}catch( Exception E) {
			//E.printStackTrace();
		System.out.println(E);	
		}
		

	}

}
