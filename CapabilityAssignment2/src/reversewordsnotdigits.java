import java.util.Scanner;

public class reversewordsnotdigits {
	
	static int count = 0,i,j;
	public static String rev1(String a)
	 {	
		 String reverse = new String();
		 int n = a.length();
		 for(i=n-1;i>=0;i--)
			 reverse=reverse+a.charAt(i);
		 return reverse;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString = new String();
		String subString;
		String RevString="";
		System.out.println("Enter the sentence : ");
		Scanner scanner = new Scanner(System.in);
		inputString = scanner.nextLine();
		scanner.close();
		
		System.out.println("Entered sentence : "+inputString);

		
		for(i=0;i<inputString.length();i++)
		{
			
			subString="";
			if((inputString.charAt(i)!=' ') && (inputString.charAt(i)!='.')&& (inputString.charAt(i)!=',')&& !((inputString.charAt(i)>='0')&&(inputString.charAt(i)<='9')))
			{
				for(j=i;j<inputString.length();j++)
				{
					if((inputString.charAt(j)!=' ') && (inputString.charAt(j)!='.')&& (inputString.charAt(j)!=',')&& !((inputString.charAt(j)>='0')&&(inputString.charAt(j)<='9')))
					{
						subString=subString+inputString.charAt(j);
					}
					else break;
				}
		//		System.out.println(subString);
				RevString=RevString+rev1(subString);
				i=i+j;
			}
			else
				{
			//	System.out.println(inputString.charAt(i));
				RevString=RevString+inputString.charAt(i);
				}
		}
		
		System.out.println("Reversed String : "+RevString);
	}

}
