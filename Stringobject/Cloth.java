package Stringobject;


public class Cloth {
int cost;
String color;
char size;
Cloth(int cost,String color,char size)
{
	this.cost=cost;
	this.color=color;
	this.size=size;
}
public String toString()
{
	return "Cost is: "+this.cost+
		   "\ncolor is: "+this.color+
		   "\nsize is: "+this.size;
}
public static void main(String[] args)
{
	Cloth b1=new Cloth(8000,"red",'L');
	System.out.println(b1);
}
}
