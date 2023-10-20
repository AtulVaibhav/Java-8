
class TicketBooking{
	static int availableSeats = 10;
	public synchronized void booking(String username,int requestedSeats){
	  System.out.println("Welcome to BookMyTicket");
	  System.out.println("Initializing the app...");
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	  System.out.println("Username :"+username+" has requested for "
	+requestedSeats+" seats");	
	  System.out.println("Please wait..Checking for availability");
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  if(availableSeats>=requestedSeats){
		  System.out.println("Seats allocated successfully");
		  availableSeats = availableSeats - requestedSeats;
	  }else{
		  System.out.println("Sorry.Seats are not available");
	  }
	  
	  System.out.println("Thank you for using BookMyTicket");
	}
	
}

class Registration extends Thread{
	private String username;
	private int requestedSeat;
	private TicketBooking ticketBooking;
	
	Registration(String username,int requestedSeat,TicketBooking ticketBooking){
		this.username = username;
		this.requestedSeat = requestedSeat;
		this.ticketBooking = ticketBooking;
	}
	
	
	
	public void run(){
		this.ticketBooking.booking(username, requestedSeat);
	}
}

public class Test9 {

	public static void main(String[] args) {
		TicketBooking ticketBooking = new TicketBooking();
		Registration user1 = new Registration("Amit", 6,ticketBooking);
		Registration user2 = new Registration("Rahul", 5,ticketBooking);
		
		user1.start();
		user2.start();
	}

}
