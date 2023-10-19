//LifeCycle of Thread
public class Test3 extends Thread{
	//Running
    public void run(){
    	System.out.println("run() executed");
    	
    	try {
    		//Blocked/Waiting
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("Thread is in running state again");
    }
    //Termination
	public static void main(String[] args) {
		//New
		Test3 t = new Test3();
		
		//Runnable
		t.start();
	}

}
/**
 *  New---->Runnable---->Running----->Termination
 *               |        |
 *                Blocked 
 */

                   