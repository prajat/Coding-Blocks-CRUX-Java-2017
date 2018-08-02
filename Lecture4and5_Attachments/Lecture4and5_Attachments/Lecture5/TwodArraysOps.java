package Lecture5;

import java.util.Scanner;

public class TwodArraysOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[][] arr=takeInput();

		int[][] arr = { { 11, 12, 13 }, { 21, 22, 23 }, { 31, 32, 33 } };
		display(arr);
		// wavePrint(arr);
		spiralPrint(arr);
	}

	public static int[][] takeInput() {
		Scanner s = new Scanner(System.in);
		int[][] arr;
		System.out.println("enter the number of rows");
		int rows = s.nextInt();
		arr = new int[rows][];
		for (int row = 0; row < arr.length; row++) {
			System.out.println("Enter the number of columns for row " + row);
			int cols = s.nextInt();
			arr[row] = new int[cols];
			for (int col = 0; col < arr[row].length; col++) {
				System.out.println("Enter the value for row " + row + "and col " + col);
				arr[row][col] = s.nextInt();
			}
		}
		return arr;
	}

	public static void display(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}

	public static void wavePrint(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			if (row % 2 == 0) {
				for (int col = 0; col < arr[row].length; col++) {
					System.out.print(arr[row][col] + ", ");
				}
			} else {
				for (int col = arr[row].length - 1; col >= 0; col--) {
					System.out.print(arr[row][col] + ", ");
				}
			}
		}
		System.out.println("END");
	}

	public static void spiralPrint(int[][] arr) {
		int left = 0, top = 0, bottom = arr.length - 1, right = arr[top].length - 1;
		int dir = 1;
		int count = (bottom + 1) * (right + 1);

		while (top <= bottom && left <= right) {
			if (count > 0) {
				if (dir == 1) {
					for (int i = left; i <= right; i++) {
						System.out.print(arr[top][i] + ", ");
						count--;
					}
					dir = 2;
					top++;
				}
			}
			if (count > 0) {
				if (dir == 2) {
					for (int i = top; i <= bottom; i++) {
						System.out.print(arr[i][right] + ", ");
						count--;
					}
					dir = 3;
					right--;
				}
			}
			if (count > 0) {
				if (dir == 3) {
					for (int i = right; i >= left; i--) {
						System.out.print(arr[bottom][i] + ", ");
						count--;
					}
					dir = 4;
					bottom--;
				}
			}
			if (count > 0) {
				if (dir == 4) {
					for (int i = bottom; i >= top; i--) {
						System.out.print(arr[i][left] + ", ");
						count--;
					}
					dir = 1;
					left++;
				}
			}
		}

	}

}
