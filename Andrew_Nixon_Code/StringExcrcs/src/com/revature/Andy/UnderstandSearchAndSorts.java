package com.revature.Andy;

public class UnderstandSearchAndSorts {

	int[] arr;
	
	public UnderstandSearchAndSorts(int[] a) {
		arr = a;
	}
	
	public static void main(String[] args) {
		/*
		 * binary search
		 * breadth-first search
		 * depth-first search
		 * bubble sort
		 * merge sort
		 * insertion sort
		 */

	}
	
	public int binarySearch(int value) {
		int L = 0;
		int R = arr.length - 1;
		int m = (L + R)/2;
		if (arr[m] < value) {
			return binaryHelp(m+1, R, value);
		}
		if (arr[m] > value) {
			return binaryHelp(L, m-1, value);
		}
		return -1; 
	}
	
	private int binaryHelp(int L, int R, int value) {
		int m = (L + R)/2;
		if (arr[m] < value) {
			binaryHelp(m+1, R, value);
		}
		else if (arr[m] > value) {
			binaryHelp(L, m-1, value);
		}
		else {
			return m;
		}
		return -1;
	}
	
	//public int breadthFirstSearch()

	//bubbleSort 
	public void bubbleSort(int[] a) {
		int n = a.length;
		boolean noSwap = false;
		while(noSwap) {
			noSwap = true;
			for (int i = 0; i < n-1 ; i++) {
				if (a[i] > a[i+1]) {
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					noSwap = false;
				}
			}
		}		
	}
	
	//insertion sort
	public void insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int j = a[i];
			int k = i - 1;
			while ((j >= 0) && (a[k] > j)) {
				a[k+1] = a[k];
				k--;
				a[k+1] = k;
			}
		}
	}
	
	
	//merge sort
	private void mergeSort(int[] A, int[] B, int n) {
		copyArray(A, 0, n, B);
		split(B, 0, n, A);
	}

	private void split(int[] b, int x, int y, int[] a) {
		// TODO Auto-generated method stub
		if((y - x) < 2) {
			return;
		}
		int m = (x + y)/2;
		split(a, x, m, b);
		split(a, m+1, y, b);
		
		merge(b, x, m, y, a);
	}

	private void merge(int[] b, int x, int m, int y, int[] a) {
		// TODO Auto-generated method stub
		int i = x;
		int j = m;
		for (int k = x; k < y; k++) {
			if (i < m && (j >= y || a[i] <= a[j])) {
				b[k] = a[i];
				i++;
			}
			else {
				b[k] = a[j];
				j++;				
			}
		}		
	}

	private void copyArray(int[] a, int x, int y, int[] b) {
		// TODO Auto-generated method stub
		for (int i = x; i < y; i++) {
			b[i] = a[i];
		}
		
	}
}
