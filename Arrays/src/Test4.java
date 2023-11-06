//WAP to search a key in the given array.If present return position otherwise 
// return -1
public class Test4 {
    public static int searchElement(int[] arr,int key){
    	for(int i=0;i<arr.length;i++){
    		if(arr[i]==key){
    			return i;
    		}
    	}
    	return -1;
    }
	public static void main(String[] args) {
		int[] array = {21,31,41,51,11,61,91};
		int key = 11;
		int index = searchElement(array, key);
		if(index>=0){
			System.out.println("ELement present at position :"+index);
		}else{
			System.out.println("Element not found");
		}

	}

}
