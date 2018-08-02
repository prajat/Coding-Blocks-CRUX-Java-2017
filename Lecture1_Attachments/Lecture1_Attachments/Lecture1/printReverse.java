package Lecture1;

public class printReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5431;
		while (N != 0) {
			int rem = N % 10;
			System.out.print(rem);
			N = N / 10;
		}
	}

}
