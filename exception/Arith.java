package exception;

public class Arith {
public static void main(String[] args) {
	System.out.println("*** Main strats ****");
	try{
	int i=1/0;
	}
	catch(ArithmeticException e)
	{
	System.out.println("handled");
	}
	System.out.println("*** Main ends ***");
}
}
