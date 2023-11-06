// Array is a homogeneous data structure
// It is static in nature
// It is non-primitive type
// Indexing is allowed
// Array starts with zero
public class Test {

	public static void main(String[] args) {
		//creating an array
		//1.data_type[] nameofArray = {e1,e2,e3,e4,...,en};
		int[] arr = {1,2,3,4,5,6,7};
		
		//accessing the elements :
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);
		System.out.println(arr[6]);
		
		System.out.println("--------------------------");
		// using for loop to traverse
		for(int i=0;i<7;i++){
			System.out.println(arr[i]);
		}
		System.out.println("--------------------------");
		//using enhanced-for loop
		for(int ele : arr){
			System.out.print(ele+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
		// number of elements in an array
		System.out.println("Number of elements :"+arr.length);
		
		System.out.println();
		System.out.println("--------------------------");
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		

	}

}
