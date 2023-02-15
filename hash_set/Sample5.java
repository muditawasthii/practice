package hash_set;
import java.util.HashSet;

public class Sample5 {
	public static void main(String[] args) {
		HashSet l1 = new HashSet();
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
	
	
