package equalprogram;

public class Mobile {
String name;
Mobile(String name)
{
	this.name=name;
}
public boolean equals(Object obj)
{
	Mobile std2 = (Mobile)obj;
	return this.name==std2.name;
}
public static void main(String[] args)
{
	Mobile std1=new Mobile("Apple");
	Mobile std2=new Mobile("Samsung");
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
