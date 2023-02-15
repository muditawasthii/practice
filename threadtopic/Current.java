package threadtopic;

public class Current {
public static void main(String[] args) {
	Thread th = new Thread();
	System.out.println(th.getPriority());
	System.out.println(th.getName());
	System.out.println(th.getId());
	th.setPriority(6);
	System.out.println(th.getPriority());
	th.setName("Mudit");
	System.out.println(th.getName());
}
}
