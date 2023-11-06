//WAP to find the sum of all elements


public class Test3 {
   public static int sumOfElements(int[] arr){
	   int sum = 0;
	   for(int ele: arr){
		   sum = sum + ele;
	   }
	   return sum;
   }
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		System.out.println(sumOfElements(arr));

	}

}
