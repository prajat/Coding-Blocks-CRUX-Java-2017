package Lecture4;

import java.util.ArrayList;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] arr;

		// System.out.println(arr);
		int[] arr = new int[5];

		// System.out.println(arr[0]);
		// System.out.println(arr[1]);
		// System.out.println(arr[arr.length]);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 10;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		// Part Swap
		int i = 0, j = 2;
		System.out.println(arr[i] + "," + arr[j]);
		swap(arr, i, j);
		System.out.println(arr[i] + "," + arr[j]);

		// ArrayList
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		System.out.println(list.size());

		list.add(10);
		System.out.println(list);
		System.out.println(list.size());

		list.add(20);
		System.out.println(list);
		System.out.println(list.size());

		list.add(30);
		System.out.println(list);
		System.out.println(list.size());

		list.set(0, 100);
		System.out.println(list);
		System.out.println(list.size());
		
		list.remove(1);
		System.out.println(list);
		System.out.println(list.size());

	}

	public static void swap(int[] arr, int i, int j) {
		System.out.println(arr[i] + "," + arr[j]);
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		System.out.println(arr[i] + "," + arr[j]);
	}

}
