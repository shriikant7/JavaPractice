package Javapractice;

public class Specialcharreplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "Welcome@to£my%world8767%";
		S =S.replaceAll("[^a-zA-Z0-9]"," ");
		System.out.println(S);

	}

}
