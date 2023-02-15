package Priority_Queue;

import java.util.PriorityQueue;

public class Sample3 {
	public static void main(String[] args)
	{
		PriorityQueue l1 = new PriorityQueue();
			l1.add("Goa");	
		    l1.add("Bnagalore");
		    l1.add("Mysore");
		    l1.add("Ooty");
		    System.out.println(l1);
		    l1.remove("Ooty");
		    System.out.println(l1);
		    l1.remove("Goa");
		    System.out.println(l1);
	}
	}
