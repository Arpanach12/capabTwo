import java.util.regex.*;
public class RegexExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("d....metacharacters"); //once for any digit
		System.out.println(Pattern.matches("\\d", "a"));
		System.out.println(Pattern.matches("\\d","1"));
		System.out.println(Pattern.matches("\\d","ayyyyzz"));
		System.out.println(Pattern.matches("\\d","amnta"));
		System.out.println(Pattern.matches("\\d","ayz"));
		
		System.out.println("D....metacharacters"); //once for any character
		System.out.println(Pattern.matches("\\D", "a"));
		System.out.println(Pattern.matches("\\D","aaa"));
		System.out.println(Pattern.matches("\\D","ayyyyzz"));
		System.out.println(Pattern.matches("\\D","amnta"));
		System.out.println(Pattern.matches("\\D","ayz"));
		
		System.out.println("D*....metacharacters"); //zero or more times any character
		System.out.println(Pattern.matches("\\D*", "ayyyyz"));

	}

}
