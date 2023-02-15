package hash_set;
import java.util.HashSet;
public class Sample1 {
	public static void main(String[] args) {
		HashSet l1 = new HashSet();
		l1.add(10);
		l1.add(20);
		l1.add(37.22);
		l1.add('A');
		l1.add("hello");
		
		System.out.println(l1);
		l1.remove(10);
		System.out.println(l1);
}
}
