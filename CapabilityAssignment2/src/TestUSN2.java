import java.util.*;
import java.util.regex.*;

public class TestUSN2 {
	
	static boolean validity(String str)
	{
		Pattern pattern = Pattern.compile("\\b[1-2][A-Z]{2}[0-9]{2}[CS|IS|EC|ME]{2}[0-9]{3}\\b");
		Matcher matcher = pattern.matcher(str);
		boolean y = matcher.matches();
		return y;
	}
	public static void main(String[] args) {
		String S;
		System.out.println("Enter USN : ");
		Scanner s = new Scanner(System.in);
		S = s.next();
		
		System.out.println("USN validity "+validity(S));
		s.close();
	}

}
