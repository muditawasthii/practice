package exception;

public class Sample {
public static void main(String[] args) {
	try{
	int i = 1/0;
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println("Handled");
	}
	catch(ArithmeticException e)
	{
	System.out.println("caughttt");
	}
}
}
