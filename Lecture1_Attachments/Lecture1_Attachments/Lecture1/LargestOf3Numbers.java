package Lecture1;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int c = 30;

		// if (a > b && a > c) {
		// System.out.println(a);
		// } else {
		// if (b > a && b > c) {
		// System.out.println(b);
		// } else {
		// System.out.println(c);
		// }
		// }

		if (a > b && a > c) {
			System.out.println(a);
		} else if (b > a && b > c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}

}
