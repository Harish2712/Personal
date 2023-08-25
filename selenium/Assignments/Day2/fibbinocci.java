package week2;

public class fibbinocci {
	
	public static void main(String[] args) {

		int firstNum = 0;
		int secNum = 1;
		int sum = 0;
		int fib = 10;
		
		for(int i=0; i<=fib; i++)
		{
			sum = firstNum+secNum;
			System.out.println(sum);
			firstNum = secNum;
			secNum = sum;		
		}
	}

}
