import java.util.*;
import java.String.*;
public class TestUSN {
	
	String USN = new String();
	
	void validateUSN()
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the String : ");
	 USN = sc.nextLine();
	 System.out.print("String to be validated is : "+USN);
	 int l = USN.length();
	 
	
	 	if(l==10)
	 	{
	 		if(USN.charAt(0)=='1'||USN.charAt(0)=='2')
	 		{
	 			if(Character.isUpperCase(USN.charAt(1)) && Character.isUpperCase(USN.charAt(2)))
	 					{
	 				if(Character.isDigit(USN.charAt(3)) && Character.isDigit(USN.charAt(4))) 
	 				{
	 				Character.isUpperCase(USN.charAt(5)==''||USN.charAt(0)=='2')
	 				
	 				}
	 					}
	 		}
	 	  		
	 		
	 	}
	 	else
	 		System.out.println("Failure");
	 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestUSN tUSN = new TestUSN();
		tUSN.validateUSN();

	}

}
