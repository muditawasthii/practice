package linked_hash_set;

import java.util.LinkedHashSet;

public class Sample {
	public static void main(String[] args) {
		LinkedHashSet l1 = new LinkedHashSet();
		l1.add(10);
		l1.add(20);
		l1.add(37.22);
		l1.add('A');
		l1.add("hello");
		System.out.println(l1);
	}
}
