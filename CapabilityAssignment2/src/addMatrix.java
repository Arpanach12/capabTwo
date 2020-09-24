import java.util.*;
public class addMatrix {
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[10][10];
		int[][] b = new int[10][10];
		int[][] c = new int[10][10];
		int i,j,k,row,col;
		System.out.println("Enter total no. of rows : ");
		row = sc.nextInt();
		System.out.println("Enter total no. of columns : ");
		col=sc.nextInt();
		System.out.println("Enter matrix 1 elements : ");
		for(i=0;i<row;i++)
			for(j=0;j<col;j++)
				a[i][j]=sc.nextInt();
		
		System.out.println("Enter matrix 2 elements : ");
		for(i=0;i<row;i++)
			for(j=0;j<col;j++)
				b[i][j]=sc.nextInt();
		
		System.out.println("Matrix 1 : ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
				{System.out.print(a[i][j]+" ");}
			System.out.println();
	    }
		
		System.out.println("Matrix 2 : ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
				{System.out.print(b[i][j]+" ");}
			System.out.println();
	    }
		
		System.out.println("Matrices Sum : ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
				{System.out.print((a[i][j]+b[i][j])+" ");}
			System.out.println();
	    }
	}
}
