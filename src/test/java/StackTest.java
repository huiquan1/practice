import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class StackTest{

@Test
public void test(){

	Stack s = new Stack();
	s.push(112);
	s.push(32);
	s.push(43);
	s.sort();
	assertThat(s.pop(),equalTo(112));
	assertThat(s.pop(),equalTo(43));
	assertThat(s.pop(),equalTo(32));
}

}

