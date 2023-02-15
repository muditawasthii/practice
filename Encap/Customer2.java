package Encap;

class Myntra {
private String pwd="abxv123";
public String getpwd()
{
	return pwd;
}
public void setpwd(String pwd)
{
	this.pwd = pwd;
}
}
public class Customer2
{
public static void main(String[] args)
	{
	Myntra m1 = new Myntra();
	System.out.println("Old password is: "+m1.getpwd());
	m1.setpwd("dfjhf9393");
	System.out.println("New password is: "+m1.getpwd());
	}
}
