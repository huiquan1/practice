import org.junit.Test;
import org.junit.Ignore;
import java.util.Arrays;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;  

public class QuickSortTest{
@Test
public void test(){
	int[] arr ={4,2,7,3,5,9,2};
	QuickSort q = new QuickSort();
	q.sort(arr);
	assertThat(Arrays.toString(arr),equalTo("[2, 2, 3, 4, 5, 7, 9]"));
	System.out.println(Arrays.toString(arr));
}
}
