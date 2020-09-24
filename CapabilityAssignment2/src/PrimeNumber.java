import java.util.Scanner;
public class PrimeNumber {
	private boolean flag;
	
	static boolean isPrime(long num)
	{
		boolean flag=true;
		if(num<2)
			return false;
		else if(num==2)
			return true;
		else
		{
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
		}
		return flag;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber pn = new PrimeNumber();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the range for which prime numbers to be printed : ");
		long m=sc.nextLong();
		for(int i=1;i<=m;i++)
		{
			if(isPrime(i)==true)
				System.out.print(i+" ");
		}
	}
}
