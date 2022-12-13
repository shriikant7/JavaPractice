package Javapractice;
class Abs{
	void abc() {
		System.out.println("Hiii");
	}
}
public class PraThread implements Runnable{
	Abs A = new Abs();
	public void run() {
		A.abc();
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PraThread T = new PraThread(); 
		 Thread T1 = new Thread(T);
		 T1.start();
		 
		   
	}

}
