package week3assignment;

public class OddIndexToUpperIndex {

	public static void main(String[] args) {
		String test = "changeme";
		char[] c=test.toCharArray();
		
		for (int i = 0; i < c.length; i++) {
			if (i%2 != 0) {	
				c[i]= Character.toUpperCase(c[i]);
				System.out.print(c[i] + " ");
			}
			else
			{
				System.out.print(c[i]+ " ");
			}	
		}
	}
}
