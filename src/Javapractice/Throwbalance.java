package Javapractice;

public class Throwbalance extends Exception{
	private static int acc[] = { 1001,1002,1003, 1004};
	private static String name[] = {"Shrikant", "Akshay", "Kailas", "Ah"};
	private static double balance[] = {1222.1, 2112.3, 1231.2,1222.1};
	Throwbalance(){
		super("Balance is greater than 2000");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println( "ACC NO "+ "\t" + "ACC name" +"\t" + "Acc balance");
			for(int i=0; i<5; i++) {
				System.out.println(acc[i] + "\t" + name[i] + "\t" + balance[i]);
				/*if(balance[i]>2000) {
					throw new Throwbalance();
				}*/
			}
		}catch(Exception E) {
			
		}

	}

}
