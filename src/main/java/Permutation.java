import java.util.Arrays;

public class Permutation{
	private String sort(String str){
		char[] content = str.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}

	public boolean permutation(String s,String t){
		return sort(s).equals(sort(t));
	}
}
