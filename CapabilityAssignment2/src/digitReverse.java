import java.util.Scanner;
public class digitReverse {
	private int rem,sum=0;
	int rev(int n)
	{
		while(n>0)
		{
		rem=n%10;       		// extracting the last digit
		sum=sum*10+rem;			// building the reverse number 
		n=n/10;					// to extract next digit
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		digitReverse dR=new digitReverse();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the digit : ");
		int num=sc.nextInt();
		System.out.println("Reverse of "+num+" is "+dR.rev(num));	// prints reverse no.
	}

}
