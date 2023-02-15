package equalprogram;

public class Uni {
String name;
Uni(String name)
{
	this.name=name;
}
public boolean equals(Object obj)
{
	Uni std2 = (Uni)obj;
	return this.name==std2.name;
}
public static void main(String[] args)
{
	Uni std1=new Uni("DPS");
	Uni std2=new Uni("GSH");
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
