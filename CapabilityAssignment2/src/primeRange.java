import java.util.Scanner;
public class primeRange {
	
private boolean flag;
	
	boolean isPrime(long num)
	{
		flag=true;
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
		}
		return flag;
		}	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrimeNumber pn = new PrimeNumber();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		long n=sc.nextLong();
		System.out.println(n+"   "+pn.isPrime(n));
	}

}
