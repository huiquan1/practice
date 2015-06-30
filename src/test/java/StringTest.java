import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class StringTest{

	public void test(){
		String a ="what are you nong sha lei";
		String b ="what are you nong sha lei";
		assertThat(a,is(b));
		assertThat(a,equalTo(b));
	}
	public void test2(){
		String a ="what are you nong sha lei";
		String b =new String("what are you nong sha lei");
		assertThat(a,not(b));
		assertThat(a,equalTo(b));
	}

	public void test3(){
		String a ="what are you nong sha lei";
		assertThat(a,not(getStr()));
		assertThat(a,equalTo(getStr()));
	}
	private String getStr(){
		String b ="what are you nong sha lei";
		return b;
	}

}
