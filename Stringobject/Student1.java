package Stringobject;

public class Student1 {
int stdid;
Student1(int stdid)
{
	this.stdid=stdid;
}
public boolean equals(Object obj)
{
	Student1 std2=(Student1)obj;
	return this.stdid==std2.stdid;
}
public static void main(String[] args) {
	Student1 std1=new Student1(40);
	Student1 std2=new Student1(40);
	System.out.println(std1.equals(std2));
}
}

//HashCode program

// public class Student1
// {
//	 public int hashCode()
//	 {
//		 return 1234;
//	 }
//	 public static void main(String[] args) {
//		Student1 s1= new Student1();
//		System.out.println(s1.hashCode());
//	}
// }