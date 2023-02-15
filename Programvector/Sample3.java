package Programvector;

import java.util.*;

public class Sample3 {
public static void main(String[] args)
{
	Vector l1 = new Vector();
		l1.add("Goa");	
	    l1.add("Bnagalore");
	    l1.add("Mysore");
	    l1.add("Ooty");
	    System.out.println(l1);
	    l1.remove(1);
	    System.out.println(l1);
	    l1.remove("Goa");
	    System.out.println(l1);
}
}
