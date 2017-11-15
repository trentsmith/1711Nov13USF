package com.revature.day2demo;

public class MySearchAndSorts {
	public static void main(String[] args) {
	int[] uarr = {9, 7, 1, 3, 4, 8, 4, 5, 0, 2, 6};
	
	int[] sarr = {0,2,4,6,8,10,12,14,16,18};		
	
	int find = 17;
	
	int index = binarysearch(find, sarr);
	System.out.println(index);
	
	bubblesort(uarr);
	for (int i : uarr) {
		System.out.print(i);
	}
		System.out.print("\n");
	int[] uarr2 = {9, 7, 1, 3, 4, 8, 4, 5, 0, 2, 6};
	insertion(uarr2);
	for (int i : uarr2) {
		System.out.print(i);
	}
		System.out.print("\n");
	
	
	int[] uarr3 = {9, 7, 1, 3, 4, 8, 5, 0, 2, 6};
	
	for (int i : uarr3) {
		System.out.print(i);
	}
		System.out.print("\n");
	}

	/*
	 * implement:
	 * binary
	 * BFS
	 * DFS
	 * bubble
	 * merge
	 * insertion
	 */
	


	
	//binary
	static int binarysearch(int value, int[] nums)  {
		
		//initial minimum, maximum, and mid
		int min = 0;
		int max = nums.length;
		int mid = (max + min)/2;
		
		while (min < max) {
			
			if (value == nums[mid]) return mid;//if mid == value, you found it
			
			else if (value < nums[mid]) {//if value is smaller
				max = mid - 1;			 //the new max is one under the current mid
				mid = (max + min)/2;	 //the new middle is the avg of same min and new max
			}
			else {
				min = mid + 1;			//opposite as above
				mid = (max + min)/2;
			}
		}
		return -1;
	};
	
	static void bubblesort(int[] arr) {
		int len = arr.length;
		int track = 1;
		boolean swap = true;
		while(swap) {
			track = 1;
			swap = false;
			while (track < len) {
				if (arr[track] < arr[ track-1 ]) {
					swap(arr, track, track-1);
					swap = true;
				}
				track++;
			}
		}
	}
	
	static void swap(int[] arr, int in1, int in2 ) {
	int tmp = arr[in1];
	arr[in1] = arr[in2];
	arr[in2] = tmp;
	}
	
	
	
	/*
	 * start at ar[1]
	 * if larger than previous
	 * 	
	 */
	static void insertion(int[] arr) {
		int index = 1;
		int len = arr.length;
		int track;
		while (index < len) {
			track = index;	
			while(track > 0  && (arr[track] < arr[track - 1])) {
				swap(arr, track, (track - 1));
				track--;
			}
			index++;
		}
	}


	static int[] mergesort(int[] arr) {
		int len = arr.length;
		if(len < 2) return arr;
		
		int[] arr1 = new int[(len/2)];
		int[] arr2 = new int[(len/2)];
		
		mergesort(arr1);
		mergesort(arr2);
		
		return merge(arr1, arr2);
		
	}
	
	static int[] merge(int[] Larr, int[] Rarr) {
		int lenL = Larr.length, lenR = Rarr.length;
		int len_total = lenL + lenR;
		int[] ans = new int[Larr.length + Rarr.length];
		
		int l_Ind = 0, r_Ind = 0, a_Ind = 0;
		
		/*
		 *  
		 */
		while((l_Ind + r_Ind) < len_total) {
			if (l_Ind + 1 == lenL) {
				ans[a_Ind++] = Rarr[r_Ind++];
				continue;
			}
			else if (r_Ind + 1 == lenR) {
				ans[a_Ind++] = Larr[l_Ind++];
				continue;
			}
			
			if(Larr[l_Ind] < Rarr[r_Ind]) {
				ans[a_Ind++] = Larr[l_Ind++];
			}
			else {
				ans[a_Ind++] = Rarr[r_Ind++];
			}
		}
		
		return ans;
			

		
		
	}
}




