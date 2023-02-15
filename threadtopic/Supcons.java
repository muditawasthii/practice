package threadtopic;

//class Samp {
//	Samp() {
//		System.out.println("lalallilla");
//	}
//}
//
//class Dem extends Samp {
//	Dem(String a) {
//		super();
//		System.out.println("aaa");
//	}
//}
//
//class Tester extends Dem {
//	Tester(int a) {
//		super("mudit");
//		System.out.println("lulululullul");
//	}
//}
//
//public class Supcons {
//	public static void main(String[] args) {
//		new Tester(10);
//	}
//
//}
class Samp {
	Samp() {
		System.out.println("lalallilla");
	}
}

class Dem extends Samp {
	Dem(String a) {
		super();
		System.out.println("aaa");
	}
}

class Tester extends Dem {
	Tester(int a) {
		super("Sdd");
		System.out.println("lulululullul");
	}
}

public class Supcons {
	public static void main(String[] args) {
		new Tester(10);
	}

}
