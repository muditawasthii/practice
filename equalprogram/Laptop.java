package equalprogram;

public class Laptop {
int cost;
Laptop(int cost)
{
	this.cost=cost;
}
public boolean equals(Object obj)
{
	Laptop std2 = (Laptop)obj;
	return this.cost==std2.cost;
}
public static void main(String[] args)
{
	Laptop std1=new Laptop(2000);
	Laptop std2=new Laptop(8000);
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
