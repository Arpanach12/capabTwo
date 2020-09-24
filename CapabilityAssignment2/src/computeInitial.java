import java.util.*;;
public class computeInitial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		String str=new String();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		str= sc.nextLine();
		System.out.print(str.charAt(0)); //Prints first character
		for(int i=1;i<str.length();i++)
		{
			    ch= str.charAt(i);
			    if(ch==' ')
				System.out.print(str.charAt(i+1));//Prints character after space is 
				
		}
	}

}
