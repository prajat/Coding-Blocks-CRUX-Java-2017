package Lecture5;

public class TwodArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr;
		// System.out.println(arr);
		// arr=new int[][3];
		arr = new int[3][];
		//System.out.println(arr[0][0]);

		arr[0] = new int[3];
		arr[0][0]=10;
		System.out.println(arr[0][0]);
		System.out.println(arr[1]);
		
		//System.out.println(arr[1].length);
		
		arr=new int[3][3];
		System.out.println(arr[0][0]);
		System.out.println(arr[1]);

	}

}
