import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class BitTest{

	@Test
	public void test(){
		assertThat(11 & (~0 << 2),equalTo(8));
		assertThat(13 ^ (~13),equalTo(-1));
		assertThat(~0>>>1,equalTo(2147483647));
		assertThat(~0<<31,equalTo(-2147483648));
	}
}
