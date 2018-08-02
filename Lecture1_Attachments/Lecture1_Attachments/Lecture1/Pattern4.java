package Lecture1;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 4;
		int value = 1;
		int row = 1;
		int col = 1;
		while (row <= N) {
			col=1;
			while(col<=row){
				System.out.print(value+"\t");
				value++;
				col++;
			}
			System.out.println();
			row++;
		}
	}

}
