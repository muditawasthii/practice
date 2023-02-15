package Programvector;

import java.util.*;

public class Sample6 {
public static void main(String[] args)
{
	Vector l1 = new Vector();
		l1.add(10);	
	    l1.add(20);
	    l1.add(30);
	    l1.add(40);
	    ArrayList l2 = new ArrayList();
	    l2.add(30);	
	    l2.add(40);
	    l2.add(50);
	    l2.add(60);
	    System.out.println(l1);
	    System.out.println(l2);
	    l1.retainAll(l2);
	    System.out.println(l1);
	    System.out.println(l2);
}
}
