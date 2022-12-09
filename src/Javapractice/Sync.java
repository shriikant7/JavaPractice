package Javapractice;
class Bank {
	public synchronized void m() {
		for(int i=0; i<=10; i++) {
			System.out.println(i);
		}
		for(int j = 11 ; j<=20 ; j++) {
			System.out.println(j);
		}
		
		
	}
}
class Onee extends Thread{
	 Bank B;
	 public Onee(Bank B) {
		 this.B=B;
	
	}
	public void run() {
		B.m();
	}
}
public class Sync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b= new Bank();
     Onee T = new Onee(b);
     T.start();
     System.out.println("Hii");
		System.out.println("Hello");
		System.out.println("12345");
		System.out.println("09876");
		System.out.println("qwert");
		System.out.println("jkl");
	}

}
