import java.util.Scanner;


public class king {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a;
	String d="";
	System.out.println("enter the string:");
	a=sc.next();
	int b=a.length();
	String[] c=a.split(" ");
	for(int i=c.length-1;i>=0;i--)
	{
		d=d+""+c[i];
	}
	System.out.println(d);
}
}
