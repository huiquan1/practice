public class BinarySearch{

	public int search(int[] arr,int x){
		int low = 0; 
		int high= arr.length-1;
		int mid ;

		while(low <= high){
			mid =(low+high)/2;
			if(x < arr[mid]){
				high = mid-1;
			}else if(x >arr[mid]){
				low = mid+1;
			}else{
				return mid;
			}
		}
		return -1;
	}

	public int searchRecursive(int[] arr,int x,int low,int high){
		if(low > high) return -1;
		int mid = (low+high)/2;
		if(x < arr[mid]){
			return searchRecursive(arr,x,low, mid -1);
		}else if(x > arr[mid]){
			return searchRecursive(arr,x,mid+1, high);
		}else {
			return mid;
		}
	}
}
