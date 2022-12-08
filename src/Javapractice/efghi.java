package Javapractice;

public class efghi {

	public static void main(String[] args) {
		// TODO Auto-generated method stubclass GfG{
		   
		private static Object LOCK = new Object();
		
		  
		    Thread.sleep(1000);
		   
		    System.out.println("Thread '" + Thread.currentThread().getName() +
		      "' is woken after sleeping for 1 second");
		  
		    synchronized (LOCK)
		    {
		        LOCK.wait(1000);
		       
		        System.out.println("Object '" + LOCK + "' is woken after" +
		          " waiting for 1 second");
		    }
		}
		

	}

}
