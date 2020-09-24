import java.util.*;

public class exchangeLastNames {
	public static int j,k;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1=new String();
		String S2=new String();
		String m1=new String();
		String m2=new String();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first person name : ");
		S1 = sc.nextLine();
		System.out.print("Enter second person name : ");
		S2 = sc.nextLine();
		System.out.println("First person name : "+S1);
		System.out.println("Second person name : "+S2);
		
		int i;
		char ch1,ch2;
	//	System.out.println(S1.length());

		
		for(i=S1.length()-1;i>=0;i--) //position of space encountered in string1
		{
			 ch1=S1.charAt(i);
			if(ch1==' ')
			{
				j=i;
				break;
			}
		}
		
		for(i=S2.length()-1;i>=0;i--) //position of space encountered in string2
		{
			 ch2=S2.charAt(i);
			if(ch2==' ')
			{
				k=i;
				break;
			}
		}
		
		System.out.println("After exchange : ");
		
		for(i=0;i<j;i++)
		{
			System.out.print(S1.charAt(i));
		}
		for(i=k;i<S2.length();i++)
		{
			System.out.print(S2.charAt(i));
		}
		
		System.out.println();
		
		for(i=0;i<k;i++)
		{
			System.out.print(S2.charAt(i));
		}
		for(i=j;i<S1.length();i++)
		{
			System.out.print(S1.charAt(i));
		}
	}
}

