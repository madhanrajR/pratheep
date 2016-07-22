import java.util.Scanner;


public class weekday {
public static void main(String[] args) {
	String s="sunday";
	String a;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the day:");
	a=sc.next();
	if(a.equals(s))
	{
		System.out.println("false");
	}
	else
	{
		System.out.println("true");
	}
	
}
}
