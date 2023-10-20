

class Task implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+" = "+i);
		}
	}
	
}

public class Test7 {

	public static void main(String[] args) {
		//main thread
		System.out.println(Thread.currentThread().getName()+" starts");
		Task t = new Task();
		Task t2 = new Task();
		
		Thread th = new Thread(t);
		Thread th2 = new Thread(t2);
		
		th.setName("A");
		th2.setName("B");
		th.start();
		try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		th2.start();
		try {
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" ends");

	}

}
