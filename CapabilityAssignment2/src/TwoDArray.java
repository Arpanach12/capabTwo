
public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] table = new int[5][10];
		
		for(int row =0;row<table.length;row++)
			for(int col=0;col<table[row].length;row++)
				table[row][col]=row*10+col;
		
		for(int row =0;row<table.length;row++)
		{	for(int col=0;col<table[row].length;row++)
				System.out.print(table[row][col]+"\t");

		System.out.println();
		}
}
}
