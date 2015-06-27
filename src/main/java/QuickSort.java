public class QuickSort{
	private int partition(int[] arr,int i,int j){
		int key = arr[i];
		while(i < j){
			while(i < j && arr[j] >= key) j--;
					Util.swap(arr,j,i);
			while(i < j && arr[i] <= key) i++;
					Util.swap(arr,i,j);
		}
		return i;
	}

	private void sort(int[] arr,int i,int j){
		if(i <j){
			int m = partition(arr,i,j);
			sort(arr,i,m-1);
			sort(arr,m+1,j);
		}
	}
	public void sort(int[] arr){
			int i = 0;
			int j = arr.length-1;
			sort(arr,i,j);
	}
}
