import java.util.Scanner;
public class max3num {
    private int max;
	int GetMax(int a,int b,int c)
	{
		if(a>b && a>c)				//Checking if a is greater than b and c
			max=a;
		else if(b>a && b>c)         //Checking if a is greater than b and c
			max=b;
		else
			max=c;
		return max;
	}
	
	int GetMax2(int a,int b,int c)
	{
		if(a>b && b>c)          //Checking a is greater than other two
			max=a;
		else
		{
			if(a>c)      //if b is found to be greater than a and a is greater than c
				max=b;
			else
				max=c;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		max3num mn=new max3num();
		int num1,num2,num3;
		Scanner n = new Scanner(System.in);
		System.out.print("Entered 1st element : ");
		num1 = n.nextInt();
		System.out.print("Entered 2nd element : ");
		num2 = n.nextInt();
		System.out.print("Entered 3rd element : ");
		num3 = n.nextInt();
		System.out.println("Entered elements are : "+num1+" "+num2+" "+num3);
		System.out.println("Maximum using method1 = "+mn.GetMax(num1, num2, num3));
		System.out.println("Maximum using method2 = "+mn.GetMax2(num1, num2, num3));
		
		
	}

}
