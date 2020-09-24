import java.util.*;
public class Studentmarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int[] arr = new int[10];
		int[] count = new int[10];
		int[][] total = new int[10][10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks scored by students in a subject :");
		for(i=0;i<10;i++)
			arr[i]=sc.nextInt();
		sc.close();
		
		for(i=0;i<10;i++)
		{ 
			int k=arr[i];
			for(j=0;j<10;j++)
			{
				if(k==arr[j])
				{
					count[i]++;
					arr[j]=-1;
				}
			}
			if(k!=-1)
			System.out.println(count[i]+" student have scored "+k );
		}
		
	}
}
