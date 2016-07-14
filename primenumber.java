import java.util.Scanner;


public class primenumber {
public static void main(String[] args) {
	int a,i;
	Scanner c=new Scanner(System.in);
	System.out.println("enter the number:");
	a=c.nextInt();
	for(i=2;i<a;i++)
	{
		if(a%i==0)
		{
			System.out.println("the given number notprime");
			break;
		}
		
	}
	if(a==i)
	{
		
		System.out.println("the given number prime");
	}
}
}
