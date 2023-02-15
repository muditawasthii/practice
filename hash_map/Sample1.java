package hash_map;
import java.util.LinkedHashMap;
public class Sample1 {
public static void main(String[] args) {
	LinkedHashMap <String,Integer> h1 = new LinkedHashMap <String,Integer>();
	h1.put("Mudit", 10);
	h1.put("Mudit", 1);
	h1.put("mohan", 35);
	h1.put("deep", 77);
	h1.put("rooh", 23);
	System.out.println(h1);
}
}
