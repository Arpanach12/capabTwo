import java.util.Scanner;

public class sumDoubleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] dbArr1 = new double[50];
		double[] dbArr2 = new double[50];
		int[] sum = new int[50];
		
		Scanner sc = new Scanner(System.in);
		//Inputing array 1 size 
		System.out.println("Enter the size of the array 1 : ");
		int n1 = sc.nextInt();
		//Entering array 1 elements
		System.out.println("Enter the elements of the array 1 : ");
		for(int i=0;i<n1;i++)
		{dbArr1[i]=sc.nextDouble();}
		System.out.println("Enter the size of the array 2 : ");
		
		//Inputing array 2 size
		int n2 = sc.nextInt();
		//Entering array 2 elements
		System.out.println("Enter the elements of the array 2 : ");
		for(int i=0;i<n2;i++)
		{dbArr2[i]=sc.nextDouble();}		
		
		int m;//for sum array
		if(n1>n2)
			m=n1;
		else
			m=n2;
		
		//Printing array 1 elements
		System.out.print("Array 1 : ");
		for(int i=0;i<n1;i++)
		{System.out.print(dbArr1[i]+" ");}
		System.out.println();
		
		//Printing array 2 elements
		System.out.print("Array 2 : ");
		for(int i=0;i<n2;i++)
		{System.out.print(dbArr2[i]+" ");}
		System.out.println();
		
		//Summing array indices elements
		System.out.print("Sum Array : ");
		for(int i=0;i<m;i++)
		{
			sum[i]=(int)dbArr1[i]+(int)dbArr2[i];
			System.out.print(sum[i]+" ");
        }		
	}

}
