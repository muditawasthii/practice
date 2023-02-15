package Stringobject;


public class Student {
int cost;
char grade;
String name;
Student(int cost,char grade,String name)
{
	this.cost=cost;
	this.grade=grade;
	this.name=name;
}
public String toString()
{
	return "Cost is: "+this.cost+
		   "\ngrade is: "+this.grade+
		   "\nName is: "+this.name;
}
public static void main(String[] args)
{
	Student b1=new Student(800000,'A',"Mudit");
	System.out.println(b1);
}
}
