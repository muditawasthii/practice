package equalprogram;

public class School {
String name;
School(String name)
{
	this.name=name;
}
public boolean equals(Object obj)
{
	School std2 = (School)obj;
	return this.name==std2.name;
}
public static void main(String[] args)
{
	School std1=new School("Mount");
	School std2=new School("DPS");
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
