import java.util.regex.*;
public class regexExample2character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("[xyz]","wbcd"));// false (not x or y or z)
		System.out.println(Pattern.matches("[xyz]","x"));//true(either x)
		System.out.println(Pattern.matches("[xyz]","xxyyyyz"));
	}

}
