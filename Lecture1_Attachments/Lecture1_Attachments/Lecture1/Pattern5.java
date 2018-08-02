package Lecture1;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		int row = 1;
		int col = 1;
		while (row <= N) {
			col = 1;
			while (col <= N - row) {
				System.out.print("\t");
				col++;
			}
			col = 1;
			int value = row;
			while (col <= row) {
				System.out.print(value + "\t");
				value++;
				col++;
			}

			col = 1;
			value = value - 2;
			while (col < row) {
				System.out.print(value + "\t");
				value--;
				col++;
			}

			System.out.println();
			row++;
		}
	}

}
