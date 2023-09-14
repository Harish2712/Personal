package week3.day2;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int[] scores = {98,97,76,87,90};
		Arrays.sort(scores);
		for(int i=scores.length-1;i>=0;i--) {
			System.out.println(scores[i]);
		}
	}
}
