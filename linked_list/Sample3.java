package linked_list;

import java.util.LinkedList;


public class Sample3 {
	public static void main(String[] args)
	{
		LinkedList l1 = new LinkedList();
			l1.add(160);
			l1.add(16);
			l1.add(1);
			l1.add(34);
			l1.add(56);
			LinkedList l2 = new LinkedList();
			l2.add(76);
			l2.add(456);
			l2.add(67);
			l2.add(43);
			l2.add(21);
			l1.addAll(l2);
		  System.out.println(l1);
			System.out.println(l2);
	}
	}

