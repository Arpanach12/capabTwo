import java.util.Scanner;

public class MagicArray {
	static Scanner sc = new Scanner(System.in);
	static int sum3=0,sum4=0;
	static int allrowsum=0,allcolsum=0,alldiagsum=0;
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
		if(isMagicArray(a,row,col))
			System.out.println("Magic Array");
		else
			System.out.println("Not Magic Array");	
	}
	public static boolean isMagicArray(int[][] a,int row,int col)
	{   
		boolean t1,t2,t3;
		
		int i,j,k,count1=1,count2=1,count3=1;
		int rowsum[]=new int[row];
		int colsum[]=new int[col];
		int diagsum[]=new int[row];
		System.out.println("Matrix : ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
				{System.out.print(a[i][j]+" ");}
			System.out.println();
	    }
		
		int sum1;
		for(i=0;i<row;i++)
		{
			sum1=0;
			for(j=0;j<col;j++)
				{	
				sum1=sum1+a[i][j];
				}
			rowsum[i]=sum1;
	    }
		
		System.out.println("Row Sum : ");
		for(i=0;i<rowsum.length;i++)
			System.out.println(rowsum[i]);
		
		for(i=0;i<rowsum.length;i++)
			allrowsum=allrowsum+rowsum[i];
		
		
//		for(i=0;i<rowsum.length-1;i++)
//		{
//			if(rowsum[i]==rowsum[i+1])
//				count1++;
//		}
//		
//		if(count1==rowsum.length)
//			t1=true;//t1
//		else
//			t1= false;
		
		int sum2;
		for(i=0;i<row;i++)
		{
			sum2=0;
			for(j=0;j<col;j++)
				{	
				sum2=sum2+a[j][i];
				}
			colsum[i]=sum2;
	    }
		
		System.out.println("col Sum : ");
		for(i=0;i<colsum.length;i++)
			System.out.println(colsum[i]);
		
		for(i=0;i<colsum.length;i++)
			allcolsum=allcolsum+colsum[i];
		
//		for(i=0;i<colsum.length-1;i++)
//		{
//			if(colsum[i]==colsum[i+1])
//				count2++;
//		}
//		
//		if(count2==colsum.length)
//			t2= true;//t2
//		else
//			t2= false;

		
		for(i=0;i<row;i++)
		{
	
			for(j=0;j<col;j++)
				{	
				if(i==j)
				{
					sum3=sum3+a[i][j];}
				}
	    }
		
		System.out.println("diag Sum : "+sum3);
		
		for(i=0;i<row;i++)
		{
	
			for(j=0;j<col;j++)
				{	
				if(i+j==row-1)
				{
					sum4=sum4+a[i][j];}
				}
	    }
				
		System.out.println("Secondary Diag Sum : "+sum4);
		alldiagsum=sum3+sum4;
			if((allcolsum==allrowsum)&&(allrowsum==alldiagsum))
			return true;
			else
				return false;
		
	}
	
}
