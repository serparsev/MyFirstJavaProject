package com.netmind.exercises;

public class DemoArray {

	public int[] createArray() {
		int arr[] = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		return arr;

	}

	public int sumEvenPositions(int[] array) {

		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				sum += array[i];
			}
		}

		return sum;
	}

}
