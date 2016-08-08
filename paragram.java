import java.util.Scanner;


public class paragram {
public static void main(String[] args) {
	String a=new String();
	int flag=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the strings:");
	a=sc.nextLine();
	a=a.toLowerCase();
	String b=new String();
	System.out.println(a);
	for(int i=97;i<=122;i++)
	{
		
		if(a.indexOf((char)i)==-1)
		{
			flag=0;
			System.out.println("it is not paragram");
			break;
		}
	}
	if(flag==1)
	{
	System.out.println("it is paragram");
	}
}
}
