
public class BinarySearch {
	public static void main(String[] args){
		System.out.println("Compiled and Run!");
		int []intArray = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(binarySearch(intArray,11));

	}
	public static int binarySearch(int[] theArray, int findNumber){
		int low = 0; 
		int high = theArray.length -1;
		int mid = (low+high)/2;
		System.out.println("-----");
		while(low<=high){
			if(theArray[mid]== findNumber){
				return mid;
			}
			else if(theArray[mid]< findNumber){
				low = mid +1;
			}
			else if (theArray[mid]> findNumber){
				high = mid -1;
			}
			else{ 
				System.out.println("Not found! Something went wrong!");
				break;
			}
			mid = (high + low)/2;
		}
		return -1;
	}

}
