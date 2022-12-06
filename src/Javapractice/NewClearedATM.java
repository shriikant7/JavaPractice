package Javapractice;
class ABCD extends Exception{
	public ABCD() {
		super("Withrawal Successful");
	}
}

public class NewClearedATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bal = 24000;
     try {
    	 if(bal >20000) {
    		 throw new ABCD();
    	 }
    	 else {
    		 System.out.println("Invalid");
    	 }
    	 
     }
     catch(Exception a) {
    	 System.out.println(a.getMessage());
     }
	}

}
