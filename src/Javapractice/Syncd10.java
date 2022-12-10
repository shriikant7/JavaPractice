package Javapractice;

class Bookseatss {
	static int Total_seats = 50;
	int seats;

	synchronized static  void Bookseatsss(int seats) {
		if (seats <= Total_seats) {
			System.out.println("Seat book successfully :");
			Total_seats = Total_seats - seats;
			System.out.println("remain Seats : " + Total_seats);
		} else {
			System.out.println("No available seats :");
		}
	}
}

class Class1 extends Thread {
	Bookseatss B1 = new Bookseatss();
	int seat1;

	public void run() {
		B1.Bookseatsss(seat1);
	}
}

class Class2 extends Thread {
	Bookseatss B2 = new Bookseatss();
	int seat2;

	public void run() {
		B2.Bookseatsss(seat2);
	}
}

public class Syncd10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Syncd10 S = new Syncd10();

		Class1 A1 = new Class1();
		A1.seat1 = 3;
		A1.start();
		Class1 A2 = new Class1();
		A2.seat1 = 4;
		A2.start();

		Class2 E1 = new Class2();
		E1.seat2 = 5;
		E1.start();
		Class2 E2 = new Class2();
		E2.seat2 = 6;
		E2.start();

	}

}
