package Priority_Queue;

import java.util.PriorityQueue;

public class Sample4 {
	public static void main(String[] args)
	{
		PriorityQueue l1 = new PriorityQueue();
			l1.add("Goa");	
		    l1.add("Bnagalore");
		    l1.add("Mysore");
		    l1.add("Ooty");
		    System.out.println(l1);
		    if(l1.contains("Goa")) 
		    		{
		    	System.out.println("present");
		    		}
		    else
		    {
		    	System.out.println("Not present");
		    }
	}
	}
