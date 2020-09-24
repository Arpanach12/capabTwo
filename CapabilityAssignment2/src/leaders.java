import java.util.*;

public class leaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		size=scanner.nextInt();
		int[] arr = new int[size];
		int[] leader = new int[size];
		System.out.println("Enter the elements of array : ");
		for(int i=0;i<size;i++)
			arr[i]=scanner.nextInt();
		int i,j,k=0;
		System.out.println("Leaders are : ");
		leader[0]=arr[size-1];
		
		for(i=size-2;i>=0;i--) 
		{
			if(arr[i]>leader[k])
				{ 
				k=k+1;
				leader[k]=arr[i];
				}
			
		}
		//System.out.println(k);
		for(i=0;i<=k;i++)
			System.out.println(leader[i]);
		
	}

}
