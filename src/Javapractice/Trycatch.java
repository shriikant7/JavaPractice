package Javapractice;

public class Trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int a= 40;
			int b = 10;
			System.out.println(a/b);
			
		}
		catch(Exception aa) {
			//System.out.println(aa);
			System.out.println("Not executed");
		}
		finally{
			System.out.println("Printed value");
		}

	}

}
