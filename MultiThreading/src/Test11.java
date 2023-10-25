
class Bank{
	int amount = 10000;
	
	public synchronized void withdraw(int withdrawAmount){
		System.out.println("Going to Withdraw");
		
		if(this.amount<withdrawAmount){
			System.out.println("Low Balance.Waiting for deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.amount = this.amount-withdrawAmount;
		System.out.println("Withdraw completed");
	}
	
	public synchronized void deposit(int depositAmount){
		System.out.println("Going for Deposit");
		this.amount = this.amount + depositAmount;
		System.out.println("Amount deposited successfully");
		notify();
	}
}

public class Test11 {

	public static void main(String[] args) {
		 Bank bank = new Bank();
		 new Thread(){
			public void run(){
				bank.withdraw(15000);
			}
		 }.start();
		 
		 new Thread(){
			public void run(){
				bank.deposit(10000);
			}
		 }.start();
		 
		 
	}

}
