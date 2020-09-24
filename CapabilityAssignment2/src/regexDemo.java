import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.*;
public class regexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1,s2;
		System.out.println("Enter the pattern String");
		s1 = sc.nextLine();
		System.out.println("Enter the other String");
		s2 = sc.nextLine();
		Pattern pattern = Pattern.compile(s1);
		Matcher matcher = pattern.matcher(s2);
		System.out.println("String mathches the given Regex - "+ matcher.matches());
	}

}
