package day2demo;

public class UnderstandingArrays {

	public static void main(String[] args) {
		int a = sum();
		int b = sum(1, 5, 7, 8, 135, 2465, 4);
		int c = sum (5, 2);	
	}
	
	static int sum(int... nums) {
		int s = 0;
		for(int i:nums) {
			s = s + i;
		}	
		return s;
	}
}
