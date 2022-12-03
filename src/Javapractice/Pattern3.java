package Javapractice;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i;
        int j;
        int k;
        int l;
        for(i=0; i<=5; i++) {
        	for(j=1; j<=i; j++) {
        		System.out.print("*");
        	}
        	System.out.println("");
        }
        for(k=0; k<=5; k++) {
        	for(l=4;l>=k;l--) {
        		System.out.print("*");
        	}
        	System.out.println("");
        }
	}

}
