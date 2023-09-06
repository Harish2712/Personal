package week3assignment;

public class FindIntersection {

	public static void main(String[] args) {
		
		int[] array1= {3,2,11,4,6,7};
		int[] array2= {1,2,8,4,9,7};
		boolean found= false;
		
		int len1=array1.length;
		int len2=array2.length;
		
		for (int i = 0; i < len1; i++) {
			for (int j = 0; j < len2; j++) {
				if(array1[i]==array2[j])
				{
					System.out.println("Print the First array that matches both " + "arrays " + array1[i]);
					found=true;	
				}
				if (found) {
					
					break;		
				}
			}	
		}
	}
}
