package Javapractice;


 
 class THRE2 extends Thread{
	public void run() {
		System.out.println("Execute task 2");
	}
}
public class THRE  {
	public void run() {
		System.out.println("Execute a task:");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		THRE2 T = new THRE2();
	
		
		T.start();
		t1.start();
	}

}
