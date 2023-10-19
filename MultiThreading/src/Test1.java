
public class Test1 extends Thread{
    public void run(){
    	m1();
    }
    public void m1(){
    	System.out.println(Thread.currentThread().getName()+" executing m1()");
    }
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.setName("Thread A");
		System.out.println(t.getPriority());
		t.start();//run()
		
		Test1 t2 = new Test1();
		t2.setName("Thread B");
		System.out.println(t2.getPriority());
		t2.start();//run()
		

	}

}
/**
 * main thread ---> Thread A(Child Thread)
 * public void run(){}
 * Thread Scheduler: preemptive , Time slicing
 * 
 */



