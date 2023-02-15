package Stringobject;


public class School {
int cost;
String name;
int strength ;
School(int cost,String name,int strength)
{
	this.cost=cost;
	this.name=name;
	this.strength=strength;
}
public String toString()
{
	return "Cost is: "+this.cost+
		   "\nName is: "+this.name+
		   "\nStrength is: "+this.strength;
}
public static void main(String[] args)
{
	School b1=new School(800000,"DPS",4000);
	System.out.println(b1);
}
}
