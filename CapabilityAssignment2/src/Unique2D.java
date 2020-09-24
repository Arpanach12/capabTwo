import java.util.*;

public class Unique2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,size1,size2,size3;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the 1st array : ");
		size1=scanner.nextInt();
		int[] arr1 = new int[size1];
		System.out.print("Enter the elements of the 1st array : ");
		for(i=0;i<size1;i++)
			arr1[i]=scanner.nextInt();
		System.out.print("Enter the size of the 2nd array : ");
		size2=scanner.nextInt();
		int[] arr2 = new int[size2];
		System.out.print("Enter the elements of the 2nd array : ");
		for(i=0;i<size2;i++)
			arr2[i]=scanner.nextInt();
		
			size3=size2+size1;
		int[] unique = new int[size3];
		System.out.println("Unique elements from both the arrays are :");
		unique = uniqueElements(arr1,arr2);
		int k=unique[unique.length-1];
		for(i=0;i<k;i++)
			System.out.print(unique[i]+" ");
		
		scanner.close();
		
	}

	private static int[] uniqueElements(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		
		int[] unique1=new int[10];
		int i,j,k=0,flag=1;
		for(i=0;i<arr1.length;i++)			//comparing array1 with array2
		{	for(j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					flag=0;
					break;
				}
				else
					flag=1;
			}
			if(flag==1)
			{	unique1[k]=arr1[i]; k++; }
		}
		
		for(i=0;i<arr2.length;i++)			//comparing array2 with array 1
		{	for(j=0;j<arr1.length;j++)
			{
				if(arr2[i]==arr1[j])
				{
					flag=0;
					break;
				}
				else
					flag=1;
			}
			if(flag==1)
			{	unique1[k]=arr2[i]; k++; }
		}
		//for(j=0;j<k-1;j++)
			//System.out.print(unique1[i]+" ");
		unique1[unique1.length-1]=k;//done to get the size of last array
		return unique1;
	}

}
