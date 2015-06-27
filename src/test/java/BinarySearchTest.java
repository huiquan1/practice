import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class BinarySearchTest{

	@Test
	public void sort(){
		int[] arr = {3,4};
		BinarySearch bSearch = new BinarySearch();

		int index  = bSearch.search(arr,4);
		assertThat(index,equalTo(1));
	}
	@Test
	public void sort2(){
		int[] arr = {3,4,5,6,7,8,9,90,100,220,400,900,10000};
		BinarySearch bSearch = new BinarySearch();

		int index  = bSearch.search(arr,400);
		assertThat(index,equalTo(10));
	}

	@Test
	public void sort3(){
		int[] arr = {3,4};
		BinarySearch bSearch = new BinarySearch();

		int index  = bSearch.searchRecursive(arr,4,0,arr.length-1);
		assertThat(index,equalTo(1));
	}

}
