package week1day2;

public class Calculator {

private int addtwonumb(int num1, int num2)
{
	return num1+num2;
}
public float mul(int num1, int num2)
{
	return (num1*num2);
}
public int sub()
{
	int num1=10;
	int num2=20;
	int result;
	System.out.println(result=num2-num1);
	return result;
}
public static void main(String[] args)
{
	Calculator c = new Calculator();
	System.out.println(c.addtwonumb(10, 20));
	System.out.println(c.mul(2, 2));
    c.sub();
}		
}

