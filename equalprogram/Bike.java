package equalprogram;

public class Bike {
int cost;
Bike(int cost)
{
	this.cost=cost;
}
public boolean equals(Object obj)
{
	Bike std2 = (Bike)obj;
	return this.cost==std2.cost;
}
public static void main(String[] args)
{
	Bike std1=new Bike(2000);
	Bike std2=new Bike(2000);
    if(std1.equals(std2))
    {
    System.out.println("Its equal");
    }
    else
    {
    	System.out.println("Its not equal");
    }
}
}
