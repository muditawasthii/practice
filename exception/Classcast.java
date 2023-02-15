package exception;
import java.util.*;
public class Classcast {
public static void main(String[] args) {
	List l1 = new ArrayList();
	try{
	Vector l2 = (Vector)l1;
	}
	catch(ClassCastException e)
	{
	System.out.println("caught");
	}
}
}
