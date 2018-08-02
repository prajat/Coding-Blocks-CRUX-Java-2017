package Lecture1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 6;
		int a = 0;
		int b = 1;
		int i = 1;
		while (i <= N) {
			System.out.print(a);
			int c = a + b;
			a = b;
			b = c;
			i++;
		}
	}

}
