package Javapractice;

public class Duplicate {
  //String
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "goodMorning";
		char []B = A.toCharArray();
		
		for(int i= 0 ; i<A.length(); i++) {
			for(int j = i + 1; j<A.length(); j++) {
				if(B[i]==B[j]) {
					System.out.println(B[j]);
				}
			}
		}

	}

}
