package Javapractice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "Hello";
		char[] B = A.toCharArray();
		for(int k=B.length-1; k>=0; k--) {
			System.out.print(B[k]+ " ");
		}
		
		/*String D = "java";
		String E = " ";
		for(int i = D.length()-1; i>=0; i--) {
			E = E+ D.charAt(i);
		}
		System.out.println(E);*/
		

	}

}
