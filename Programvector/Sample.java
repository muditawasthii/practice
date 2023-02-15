package Programvector;

import java.util.*;

public class Sample {
public static void main(String[] args)
{
	Vector l1 = new Vector();
		l1.add('B');	
	    l1.add('A');
	    l1.add("hello");
	    l1.add("hi");
	    ArrayList l2 = new ArrayList(l1);
	    l2.add(20);	
	    l2.add(30);
	    l2.add(40);
	    System.out.println(l2);
}
}
