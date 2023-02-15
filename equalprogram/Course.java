package equalprogram;

public class Course {
int cost;
Course(int cost)
{
	this.cost=cost;
}
public boolean equals(Object obj)
{
	Course std2 = (Course)obj;
	return this.cost==std2.cost;
}
public static void main(String[] args)
{
	Course std1=new Course(2000);
	Course std2=new Course(2000);
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
