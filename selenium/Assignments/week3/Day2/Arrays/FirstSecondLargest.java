package week3assignment;

import java.util.Arrays;

public class FirstSecondLargest {

public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		int len=data.length;
		System.out.println("Print the second Largest number in an array " + data[len-2] );
	}
}
