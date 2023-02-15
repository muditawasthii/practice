package Stringobject;


public class Car {
int cost;
String model;
String name;
Car(int cost,String model,String name)
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
	Bike b1=new Bike(800000,"Kia","Seltos");
	System.out.println(b1);
}
}
