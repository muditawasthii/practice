package Stringobject;


public class Mobile {
int cost;
String model;
String name;
Mobile(int cost,String model,String name)
{
	this.cost=cost;
	this.model=model;
	this.name=name;
}
public String toString()
{
	return "Cost is: "+this.cost+
		   "\nModel is: "+this.model+
		   "\nName is: "+this.name;
}
public static void main(String[] args)
{
	Mobile b1=new Mobile(8000,"F15","Samsung");
	System.out.println(b1);
}
}
