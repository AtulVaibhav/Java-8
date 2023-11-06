
public class Test5 {

	public static void main(String[] args) {
		//Two dimensional array:array of arrays
		
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		
		//accessing the elements from an array
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
		}
		System.out.println();
		
		//Displaying data in Matrix format:
		System.out.println("Matrix format");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
			}
		
		
	}

}
