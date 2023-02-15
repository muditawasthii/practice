package equalprogram;

public class Student {
int stdid;
Student(int stdid)
{
	this.stdid=stdid;
}
public boolean equals(Object obj)
{
	Student std2 = (Student)obj;
	return this.stdid==std2.stdid;
}
public static void main(String[] args)
{
	Student std1=new Student(20);
	Student std2=new Student(40);
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
