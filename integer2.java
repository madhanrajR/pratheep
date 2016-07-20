import java.util.Scanner;


public class integer2 {
public static void main(String[] args) {
int a;
Scanner sc =new Scanner(System.in);
System.out.println("enter the digits:");
a=sc.nextInt();
int b=0,c = 0;
while(a!=0)
{
	b=b*10;
	b=b+a%10;
	a=a/10;
}
System.out.println(b);
}
}