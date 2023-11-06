import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//2.creating an array
		//data_type[] nameOfArray = new data_type[size];
	    
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array elements are :");
		for(int ele:arr){
			System.out.print(ele+" ");
		}
		
		
		
	

	}

}
