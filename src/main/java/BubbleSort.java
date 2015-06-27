public class BubbleSort{

public void sort(int[] arr){
	for(int n=0;n < arr.length;n++)
	{
		for(int m = n+1;m<arr.length;m++){
			if(arr[n] >arr[m]){
				Util.swap(arr,n,m);
			}
		}
	}
}

}
