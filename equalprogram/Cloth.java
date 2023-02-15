package equalprogram;

public class Cloth {
int cost;
Cloth(int cost)
{
	this.cost=cost;
}
public boolean equals(Object obj)
{
	Cloth std2 = (Cloth)obj;
	return this.cost==std2.cost;
}
public static void main(String[] args)
{
	Cloth std1=new Cloth(2000);
	Cloth std2=new Cloth(2000);
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
