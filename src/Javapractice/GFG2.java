package Javapractice;

public class GFG2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String str = "Hello";
			int B = Integer.parseInt(str);
			System.out.println(B);
			System.out.println("try block executed");
		}
		catch(Exception E) {
			System.out.println("catch block executed");
		}

	}

}
