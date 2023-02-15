package exception;

public class Indexout {
public static void main(String[] args) {
	System.out.println("Main starts");
	int arr[]={10,20,30};
	try{
	System.out.println(arr[9]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Handled");
	}
	System.out.println("Main ends3");
}
}
