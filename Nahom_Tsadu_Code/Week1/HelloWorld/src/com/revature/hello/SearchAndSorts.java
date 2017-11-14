package com.revature.hello;

import java.util.Arrays;
import java.util.Random;

public class SearchAndSorts {
	/*
	 * 1. Binary Search (COMPLETE)
	 * 2. Breadth First Search
	 * 3. Depth First Search
	 * 4. Bubble Sort (COMPLETE)
	 * 5. Merge Sort
	 * 6. Insertion Sort
	 */
	public static void main(String[] args) {
		
		int[] numArray = {2, 16, 99, 89, 45, 22, 106, 299, 12, 34, 24, 56, 3, 10};
		SearchAndSortOps ops = new SearchAndSorts().new SearchAndSortOps();
		
		//Start Search..
		ops.start(numArray);
		
		//Bubble Sort
//		numArray = ops.bubbleSort(numArray);
		
		//Merge Sort
		//System.out.println(ops.mergeSort(numArray));
		Arrays.stream(ops.mergeSort(numArray)).forEach(n -> System.out.print(n + ", "));
		
		//Binary Search
		//ops.binarySearch(ops.getRandomElement(numArray), numArray);
		
		
	}
	
	public class SearchAndSortOps{
		
		private Random gen;
		
		public SearchAndSortOps(){
			gen = new Random();
		}
		
		public void start(int[] arr){
			System.out.println("Running Searches...");
			System.out.println();
			System.out.print("Unsorted List: ");
			Arrays.stream(arr).forEach(n -> System.out.print(n + ", "));
			System.out.println();
			System.out.println();
		}
		
		public int getRandomElement(int[] arr){
			return arr[gen.nextInt(arr.length)];
		}
		
		//Runs in O(n^2)
		public int[] bubbleSort(int[] arr){
			
			boolean sorted = true;
			int swapCount = 0;
			int passCount = 0;
			
			System.out.println("Running Bubble Sort...");
			
			while(sorted){
				
				swapCount = 0;
			
				for(int i = 0; i < arr.length; i++){
					
					if(i < arr.length - 1){
						
						if(arr[i] > arr[i + 1]){
							int temp = arr[i + 1];
							arr[i + 1] = arr[i];
							arr[i] = temp;
							swapCount++;
						}
					}
					
					if(i > 0){
						if(arr[i] < arr[i - 1]){
							int temp = arr[i - 1];
							arr[i - 1] = arr[i];
							arr[i] = temp;
							swapCount++;
						}
					}
				}
				
				if(passCount > 0 && swapCount == 0){
					
					sorted = true;
					break;
				}
				
				passCount++;
			}
			
			System.out.println("Bubble Sort Completed in " + passCount + " Passes!");
			System.out.print("Sorted List: ");
			Arrays.stream(arr).forEach(n -> System.out.print(n + ", "));
			System.out.println();
			System.out.println();
				
			return arr;
		}
		
		public int[] mergeSort(int[] arr, int x, int y){
			
			if(x < y){
				
				int[] arrL = Arrays.copyOfRange(arr, 0, ((arr.length-1) / 2));
				int[] arrR = Arrays.copyOfRange(arr, ((arr.length-1) / 2), (arr.length));
				
				mergeSort(arrL);
			}
			
			return arrL;
		}

		public int binarySearch(int n, int[] arr){
			
			boolean found = false;
			int midpoint = 0;
			int num = 0;
			
			System.out.println("Running Binary Search for number " + n + "...");
			
			while(!found){
				midpoint = (arr.length-1) / 2;
				
				if(n > arr[midpoint]){
					arr = Arrays.copyOfRange(arr, (midpoint + 1), (arr.length));
				}else if(n < arr[midpoint]){
					arr = Arrays.copyOfRange(arr, 0, (midpoint));
				}else if(n == arr[midpoint]){
					num = arr[midpoint];
					found = true;
				}
			}
			
			System.out.print("Integer " + n + " was found!");
			System.out.println();
			System.out.println();
			
			return num;
		}
	

	}
	
		

}
