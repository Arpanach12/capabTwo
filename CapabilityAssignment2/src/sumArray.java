import java.util.Scanner;
public class sumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArr = new int[50];
		Scanner sc = new Scanner(System.in);
		//Inputing array size
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		//Inputing array elements
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<n;i++)
			{intArr[i]=sc.nextInt();}
		//Printing array elements
		System.out.println("Array elements are : ");
		for(int i=0;i<n;i++)
		{System.out.print(intArr[i]+" ");}
		//Calculating and printing sum
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+intArr[i];
			
		}
		System.out.println();
		System.out.println("Sum of Array elements : "+sum);
		
	}

}
