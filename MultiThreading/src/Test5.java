
public class Test5 extends Thread{
    public void run(){
    	System.out.println(Thread.currentThread().getName()+" "
       +Thread.currentThread().getPriority());
    }
	public static void main(String[] args) {
		Test5 t = new Test5();
		Test5 t2 = new Test5();
		//set name : setName()
		t.setName("A");
		t2.setName("B");
		
		//set priority : setPriority
		//MaxPriority :10  MinPriority : 1   NormPriority:5
		t2.setPriority(Thread.MAX_PRIORITY);
		t.setPriority(Thread.MIN_PRIORITY);
		
        t.start();
        t2.start();
	}

}
