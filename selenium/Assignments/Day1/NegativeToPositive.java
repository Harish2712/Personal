package week1;
public class NegtoPos {
		public static void main(String[] args) {			
			int i=-10;
			int j;
			if(i<0)
			{
				j =-i;
				System.out.println("the number " + i + " is negative so changing it to positive " + j);
			}
			else if (i>0)
			{
				j=-i;
				System.out.println("the number " + i + " is positive so changing it to negative " + j);
			}
			else
			{
				System.out.println("the number " + i + " is neither negative nor positive ");
			}			
		}
	}
