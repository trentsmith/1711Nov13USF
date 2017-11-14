package day2demo;

public class SearchAndSorts {
	/**
	 * Implement the following
	 * - binary search
	 * - breadth first search
	 * - depth first search
	 * - bubble sort
	 * - merge sort
	 * - insertion sort
	 */
	
	/**
	 *  binary search
	 */
	int binarySearch(int[] inputArr, int key) {
		// First index of the array
		int start = 0;
		
		// Last index of the array
		int end = inputArr.length - 1;

		// while loop to check if there is a matched key
		while(start <= end) {
			// middle index
			int mid = (start + end)/2;
			if(key == inputArr[mid]) {
				return mid;
			}
			
			// if the key value is less than mid value, assign mid-1 index to end
			if(key < inputArr[mid]) {
				end = mid - 1;
			}else {
				start = mid + 1;
			}
		}
		// return -1 if not found
		return -1;
	}
	
	/**
	 * breath first search
	 */
	
	/**
	 * depth first search
	 */
	
	/**
	 * bubble sort
	 */
	
	/**
	 * merge sort
	 */
	// merge sort of arr[]
	// merge two subarrays, first array is arr[left...middle], second is arr[middle+1...right]
	void merge(int arr[], int left, int middle, int right) {
		
		
	}

	// sort arr[left...right] using merge
	void sort(int arr[], int left, int right) {
		
	}
	
	/**
	 * insertion sort
	 */
	void insertionSort(int[] arr) {
		// the length of arr
		int n = arr.length;
		
		for(int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while((j > -1) && (arr[j] > key)) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
}
