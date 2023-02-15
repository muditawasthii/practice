package Encap;
class Gmail 
{
private int pwd = 1234;
public int getpwd()
{
	return pwd;
}
public void setpwd(int pwd)
{
	this.pwd=pwd;
}
}
public class Customer
{
	public static void main(String[] args)
	{
		Gmail g1 = new Gmail();
	System.out.println("Old password is: "+g1.getpwd());
		g1.setpwd(2344);
		System.out.println("Your new password is: " +g1.getpwd());
	}
}
