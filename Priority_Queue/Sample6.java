package Priority_Queue;

import java.util.PriorityQueue;

public class Sample6 {
	public static void main(String[] args)
	{
		PriorityQueue l1 = new PriorityQueue();
			l1.add(160);
			l1.add(16);
			l1.add(1);
			l1.add(34);
			l1.add(56);
			PriorityQueue l2 = new PriorityQueue();
			l2.add(34);
			l2.add(56);
			l2.add(67);
			l2.add(43);
			l2.add(21);
			l1.retainAll(l2);
		  System.out.println(l1);
			System.out.println(l2);
	}
	}
