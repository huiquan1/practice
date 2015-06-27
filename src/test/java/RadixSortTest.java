import org.junit.Test;
import java.util.Arrays;

public class RadixSortTest{
	@Test
	public void test(){
		int[] arr= {35,921,45,89,76,23,42};
		RadixSort s = new RadixSort();
		int[] sortedArr = s.sort(arr,3);
		System.out.println(Arrays.toString(sortedArr));
	}
	@Test
	public void test2(){
		int[] arr= {34,34,37,31,32,39,38};
		RadixSort s = new RadixSort();
		int[] sortedArr = s.sort(arr,2);
		System.out.println(Arrays.toString(sortedArr));
	}
}
