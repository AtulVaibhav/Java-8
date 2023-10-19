
public class Test2 extends Thread{
    public void run(){
    	System.out.println("Method is executing");
    }
	public static void main(String[] args) {
		Test2 t = new Test2();
		//Can we call start() by same thread twice?
		//IllegalThreadStateException
		t.start();
		t.start();

	}

}
