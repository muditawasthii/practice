package Stringobject;


public class Laptop{
int cost;
String model;
String name;
Laptop(int cost,String model,String name)
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
	Laptop b1=new Laptop(800000,"f15","ASUS");
	System.out.println(b1);
}
}
