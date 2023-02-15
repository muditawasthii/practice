package exception;

public class Nullpointer {
public static void main(String[] args) {
	Nullpointer n1 = null;
	try{
	System.out.println(n1.hashCode());
	}
	catch(NullPointerException e)
	{
		System.out.println("handled");
	}
}
}
