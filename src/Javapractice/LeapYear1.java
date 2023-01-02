package Javapractice;

public class LeapYear1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y = 2016;
		if(y%400==0 || y%4==0 && y%100 !=0) {
			System.out.println("leap");
		}else {
			System.out.println("leap no");
		}

	}

}
