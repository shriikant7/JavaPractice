package Javapractice;

import java.util.Scanner;

public class Evenorodd {

	public static void main(String[] args) {
		int x ;
		
     System.out.println("Enter the Number :");
     Scanner S = new Scanner(System.in);
     int y = S.nextInt();
     if(y%2==0) {
    	System.out.println("Even Number"); 
     }
     else {
    	 System.out.println("Odd Number");
     }
     
     
	}

}
