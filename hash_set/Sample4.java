package hash_set;

import java.util.HashSet;

public class Sample4 {
	public static void main(String[] args) {
		HashSet l1 = new HashSet();
		l1.add(10);
		l1.add(20);
		l1.add(37.22);
		l1.add('A');
		l1.add("hello");
		HashSet l2 = new HashSet();
		l2.add(10);
		l2.add(20);
		l2.add(3.22);
		l2.add('h');
		l2.add("hell");
		l1.retainAll(l2);
		System.out.println(l2);
		System.out.println(l1);
}
}
