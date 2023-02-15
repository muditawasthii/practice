package Stringobject;


public class Jeep {
int cost;
String model;
String name;
Jeep(int cost,String model,String name)
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
	Jeep b1=new Jeep(500000,"Bolero","XV");
	System.out.println(b1);
}
}
