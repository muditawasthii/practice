package Stringobject;


public class Course{
int cost;
String name;
Course(int cost,String name)
{
	this.cost=cost;
	this.name=name;
}
public String toString()
{
	return "Cost is: "+this.cost+
		   "\nName is: "+this.name;
}
public static void main(String[] args)
{
	Course b1=new Course(80000,"JAVA");
	System.out.println(b1);
}
}
