import org.junit.Test;
import org.junit.Ignore;
import java.util.Arrays;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;  

public class BubbleSortTest{
@Test 
public void test(){
	BubbleSort sort = new BubbleSort();
	int[] arr = {89,45,36,90,12,678};
	sort.sort(arr);
	assertThat(Arrays.toString(arr),equalTo("[12, 36, 45, 89, 90, 678]"));
	System.out.println(Arrays.toString(arr));
}


}
