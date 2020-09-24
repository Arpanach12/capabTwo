import java.util.*;

public class rowMagic {
	static Scanner sc = new Scanner(System.in);
	public static boolean isRowMagic(int[][] a,int row,int col)
	{   
		int i,j,k,count=1;
		int rowsum[]=new int[row];
		System.out.println("Matrix : ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
				{System.out.print(a[i][j]+" ");}
			System.out.println();
	    }
		
		int sum;
		for(i=0;i<row;i++)
		{
			sum=0;
			for(j=0;j<col;j++)
				{	
				sum=sum+a[i][j];
				}
			rowsum[i]=sum;
	    }
		
		System.out.println("Row Sum : ");
		for(i=0;i<rowsum.length;i++)
			System.out.println(rowsum[i]);
		
		for(i=0;i<rowsum.length-1;i++)
		{
			if(rowsum[i]==rowsum[i+1])
				count++;
		}
		
		if(count==rowsum.length)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[10][10];
		int i,j,row,col;
		System.out.println("Enter total no. of rows : ");
		row = sc.nextInt();
		System.out.println("Enter total no. of columns : ");
		col=sc.nextInt();
		System.out.println("Enter matrix elements : ");
		for(i=0;i<row;i++)
			for(j=0;j<col;j++)
				a[i][j]=sc.nextInt();
		if(isRowMagic(a,row,col))
			System.out.println("Row Magic");
		else
			System.out.println("Not Row Magic");	
	}
}
