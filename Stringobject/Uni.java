package Stringobject;


public class Uni {
int cost;
String course;
String name;
Uni(int cost,String course,String name)
{
	this.cost=cost;
	this.course=course;
	this.name=name;
}
public String toString()
{
	return "Cost is: "+this.cost+
		   "\nCourse is: "+this.course+
		   "\nName is: "+this.name;
}
public static void main(String[] args)
{
	Uni b1=new Uni(800000,"CSE","DPS");
	System.out.println(b1);
}
}
