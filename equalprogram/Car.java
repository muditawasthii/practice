package equalprogram;

public class Car {
int cost;
Car(int cost)
{
	this.cost=cost;
}
public boolean equals(Object obj)
{
	Car std2 = (Car)obj;
	return this.cost==std2.cost;
}
public static void main(String[] args)
{
	Car std1=new Car(2000);
	Car std2=new Car(2000);
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
