package Javapractice;
class Firstthread implements Runnable{
 int i;
	public void run() {
		for(i=0;i<=10 ; i++) {
			System.out.println(i);
		}
		
	}
}
public class Multith {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  Firstthread F = new Firstthread();
  Thread T = new Thread(F);
  
  //T.start();
  T.wait();
  
  System.out.println("HI");
  
  System.out.println("Hp");
  System.out.println("No");
  

  
 
	}

}
