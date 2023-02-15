package equalprogram;

public class Jeep {
int cost;
Jeep(int cost)
{
	this.cost=cost;
}
public boolean equals(Object obj)
{
	Jeep std2 = (Jeep)obj;
	return this.cost==std2.cost;
}
public static void main(String[] args)
{
	Jeep std1=new Jeep(200000);
	Jeep std2=new Jeep(600000);
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
