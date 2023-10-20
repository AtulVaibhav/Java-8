

class TA implements Runnable{
	@Override
	public void run(){
		System.out.println("Task executed");
	}
	
}
public class Test6 {

	public static void main(String[] args) {
		TA t = new TA();
		Thread th = new Thread(t);
		th.start();
	}

}
