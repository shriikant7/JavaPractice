package Javapractice;

class Bookseats {
	int Total_seats = 15;

	synchronized void Bseats(int seats) {
		if (seats <= Total_seats) {
			System.out.println("seats booked successfully :");
			Total_seats = Total_seats - seats;
			System.out.println("Remaining seats : " + Total_seats);
		} else {
			System.out.println("No Remaining seats available");
		}
	}
}

public class SyncTheatreSeats extends Thread {
	int seat;
	 static Bookseats B = new Bookseats();
         public void run() {
        	  B.Bseats(seat);
          }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SyncTheatreSeats S1 = new SyncTheatreSeats();
        S1.seat = 15;
        S1.start();
        SyncTheatreSeats S2 = new SyncTheatreSeats();
        S2.seat = 7;
        S2.start();
	}

}
