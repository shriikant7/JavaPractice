package Javapractice;

public class Multii extends Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a  =20; int b = 0; int c = 0;
		int d;
		try {
			try {
				d = a/b;
				System.out.println(d);
			}
			catch(Exception A) {
				System.out.println(A);
			}
			
		}
		catch (Exception E) {
			System.out.println(E.getMessage());
		}
		finally {
			System.out.println("Execute Always");
		}
		
  
	}

}
