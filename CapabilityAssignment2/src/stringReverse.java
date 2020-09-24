import java.util.*;
public class stringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString="KALINGA MINDTREE";
		System.out.println("reversed string : "+STRrev(inputString));
	
		
	}
	public static String STRrev(String inputString)
	{
		String reverse = " ";
		for(int i=inputString.length()-1;i>=0;i--)
		{
			reverse = reverse + inputString.charAt(i);
		}
		return reverse;
	}
}

