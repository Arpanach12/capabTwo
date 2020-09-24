import java.util.Scanner;

 
public class revdigitwords {
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
		String numString = " ";
		System.out.println("Enter the sentence : ");
		Scanner scanner = new Scanner(System.in);
		inputString = scanner.nextLine();
		scanner.close();
		
		System.out.println("Entered sentence : "+inputString);

		
		for(int i=0;i<inputString.length();i++){
			
			boolean a = (inputString.charAt(i)>=48)&&(inputString.charAt(i)<=57);
			boolean b = (inputString.charAt(i)==' ');
			
			if(!((inputString.charAt(i)>=48)&&(inputString.charAt(i)<=57) || ((inputString.charAt(i)==' '))))
			{
				subString=subString+inputString.charAt(i);	
			}
			else if(a)
			{
				System.out.print(inputString.charAt(i));
			}
			else
			{
				System.out.print(inputString.charAt(i));
				RevString=RevString+rev1(subString);
				subString=" ";
			}
				
		}
		System.out.println(RevString+rev1(subString));
	}
		
		
	}


