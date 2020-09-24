import java.util.regex.*;
public class regexexample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("?....Quantifier"); //once or not at all
		System.out.println(Pattern.matches("[ayz]?", "a"));
		System.out.println(Pattern.matches("[ayz]?","aaa"));
		System.out.println(Pattern.matches("[ayz]?","ayyyyzz"));
		System.out.println(Pattern.matches("[ayz]?","amnta"));
		System.out.println(Pattern.matches("[ayz]?","ayz"));
		
		System.out.println("+....Quantifier"); //more than once
		System.out.println(Pattern.matches("[ayz]+", "a"));
		System.out.println(Pattern.matches("[ayz]+","aaa"));
		System.out.println(Pattern.matches("[ayz]+","ayyyyzz"));
		System.out.println(Pattern.matches("[ayz]+","amnta"));
		System.out.println(Pattern.matches("[ayz]+","ayz"));
		
		System.out.println("*....Quantifier"); //zero or more times
		System.out.println(Pattern.matches("[ayz]*", "ayyyyz"));
		
	}

}
