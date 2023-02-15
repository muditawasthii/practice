package threadtopic;

class Samplu{
	Samplu(int a)
	{
		System.out.println("hello");
	}
	Samplu(String txt)
	{ 
		this(80);
		System.out.println("world");
	}
	Samplu(int a,String txt)
	{
		this("well");
		System.out.println("hellllll");
	}
	Samplu(String txt,int a)
	{ 
		this(20,"hell");
		System.out.println("HIIIIII");
	}
}

public class Thiscons {
public static void main(String[] args) 
{	
	new Samplu("hi",10);
}
}
