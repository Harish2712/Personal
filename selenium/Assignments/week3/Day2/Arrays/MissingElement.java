package week3assignment;

public class MissingElement {

	public static void main(String[] args) {
		
			int[] arr = {1,2,3,4,7,6,8};
			int a=arr.length;
			for (int i = 0; i < a; i++) {
				if (i +1 != arr[i]) {
					System.out.println(i+1);	
					break;
				}
			}
		}
}
