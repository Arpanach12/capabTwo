import java.util.*;
public class CompressString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString= new String();
		String iString;
		int count;
		iString = "AAAAaaaa";
		inputString = iString.toLowerCase();
		String outputString = " ";
		count=1;int i;
		for( i=0;i<inputString.length()-1;i++)
		{	
			
			if(inputString.charAt(i)==inputString.charAt(i+1))
			{	
				count++;
			}
			else
			{
				outputString = outputString + inputString.charAt(i)+count;
				count=1;
			}		
		}	
		System.out.print(outputString+inputString.charAt(i)+count);
	}
}
