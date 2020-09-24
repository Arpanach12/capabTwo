import java.util.regex.*;
public class RegexExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern pattern = Pattern.compile(".xx.");
		Matcher matcher = pattern.matcher("AxxB");
		System.out.println("String mathches the given Regex - "+ matcher.matches());

	}

}
