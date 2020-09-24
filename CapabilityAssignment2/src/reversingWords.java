import java.util.*;

 
public class reversingWords {
	static int count = 0;
	public static String rev1(String a)
	 {	
		 String reverse = new String();
		 int n = a.length();
		 for(int i=n-1;i>=0;i--)
			 reverse=reverse+a.charAt(i);
		 return reverse;
	 }
	public static String rev2(String a)
	 {	
		int num[]= {};
		 String reverse = new String();
		 int n = a.length();
		 for(int i=n-1;i>=0;i--)
		 {
			 if(Character.isDigit(a.charAt(i)))
			 { 
				 num[i]=a.charAt(i);
				 
				 
			}
			 else
				 reverse=reverse+a.charAt(i);
		 }
		 reverse=reverse+num;
		 return reverse;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = new String();
		String subString = " ";
		String RevString = " ";
		System.out.println("Enter the sentence : ");
		Scanner scanner = new Scanner(System.in);
		inputString = scanner.nextLine();
		scanner.close();
		
		System.out.println("Entered sentence : "+inputString);

		
		for(int i=0;i<inputString.length();i++){
		  
			if(inputString.charAt(i)!=' ')
			{
				subString=subString+inputString.charAt(i);	
			}
			else
			{
				RevString=RevString+rev1(subString);
				subString=" ";
			}
				
		}
		System.out.println("Reversed String : "+RevString+rev1(subString));
	}
		
		
	}


