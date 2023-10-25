
class Resource{
	public static final String resource1 = "Pen";
	public static final String resource2 = "Paper";
}

class T1A extends Thread{
	public void run(){
		synchronized(Resource.resource1){
			System.out.println("T1A got pen");
			System.out.println("T1A waiting for paper");
			synchronized (Resource.resource2) {
				System.out.println("T1A got paper");
				System.out.println("Writing task complete");
			}
		}
	}
}

class T2A extends Thread{
	public void run(){
		synchronized (Resource.resource2) {
			System.out.println("T2A got paper");
			System.out.println("T2A waiting for pen");
			
			synchronized (Resource.resource1) {
				System.out.println("T2A got pen");
				System.out.println("Writing task complete");
			}
		}
	}
}
public class Test10 {
   public static void main(String[] args) {
	 T1A t = new T1A();
	 T2A t2 = new T2A();
	 t.start();
	 t2.start();
}
}
