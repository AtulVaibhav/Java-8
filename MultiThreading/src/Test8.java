


class SharedResource{
	public synchronized void printTable(int num){
		System.out.println(Thread.currentThread().getName()+" is executing the task");
		for(int i=1;i<=10;i++){
			System.out.println(num+" X "+i+" = "+(num*i));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().getName()+" completed the task");
		
	}
}

class TA1 extends Thread{
	private SharedResource sharedResource;
	TA1(SharedResource sharedResource){
		this.sharedResource = sharedResource;
	}
	public void run(){
		this.sharedResource.printTable(2);
	}
	
}

class TA2 extends Thread{
	private SharedResource sharedResource;
	TA2(SharedResource sharedResource){
		this.sharedResource = sharedResource;
	}
	public void run(){
		this.sharedResource.printTable(5);
	}
	
}

class TA3 extends Thread{
	private SharedResource sharedResource;
	TA3(SharedResource sharedResource){
		this.sharedResource = sharedResource;
	}
	public void run(){
		this.sharedResource.printTable(10);
	}
	
}

public class Test8 {
    
	public static void main(String[] args) {
		SharedResource sharedResource = new SharedResource();
		TA1 t = new TA1(sharedResource);
		TA2 th = new TA2(sharedResource);
		TA3 th2 = new TA3(sharedResource);
		
		t.start();
		t.setName("A");
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		th.start();
		th.setName("B");
		try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		th2.start();
		th2.setName("C");
		try {
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
