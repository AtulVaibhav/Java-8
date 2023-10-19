
class Table{
	public void printTable(int num){
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(num+ " X "+i+" = "+(num*i)+" executed by "+Thread.currentThread().getName());
		}
	}
}

class T1 extends Thread{
	private Table table;
	private int num;
	T1(Table table,int num){
		this.table = table;
		this.num = num;
	}
	public void run(){
		this.table.printTable(this.num);
	}
}

class T2 extends Thread{
	private Table table;
	private int num;
	T2(Table table,int num){
		this.table = table;
		this.num = num;
	}
	public void run(){
		this.table.printTable(this.num);
	}
}

class T3 extends Thread{
	private Table table;
	private int num;
	T3(Table table,int num){
		this.table = table;
		this.num = num;
	}
	public void run(){
		this.table.printTable(this.num);
	}
}
public class Test4 {

	public static void main(String[] args) {
		Table table = new Table();
		T1 t1 = new T1(table,2);
		t1.setName("T1");
		t1.start();
		
		T2 t2 = new T2(table,5);
		t2.setName("T2");
		t2.start();
		
		T3 t3 = new T3(table,10);
		t3.setName("T3");
		t3.start();

	}

}
