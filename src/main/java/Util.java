import java.util.Arrays;

public class Util{
	public static void swap(int[] arr,int n, int m){
		int temp = arr[n];
		arr[n]= arr[m];
		arr[m] = temp;
	}

	public  static void out(int[] arr){
			System.out.println(Arrays.toString(arr));
	}

}
