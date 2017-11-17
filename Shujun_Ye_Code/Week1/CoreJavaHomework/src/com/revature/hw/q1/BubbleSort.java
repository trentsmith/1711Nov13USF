package com.revature.hw.q1;

public class BubbleSort {

	public static void main(String[] args) {
		int[] intArr = {1,0,5,6,3,2,3,7,9,8,4};
		bubbleSort(intArr);
	}
	
	// perform a bubble sort on a interger array
	public static void bubbleSort(int[] arr) {
		// the length of integer array
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - i - 1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
