import java.util.Scanner;


public class string1 {
 public static void main(String[] args) {
	char temp;
	int j;
	String s=new String();
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the string:");
	s=sc.next();
	char a[]=new char[s.length()];
	for(int i=0;i<s.length();i++)
	{
		a[i]=s.charAt(i);
	}
	for(j=0;j<s.length()-1;j++)
	{
		temp=a[j];
		a[j]=a[j+1];
		a[j+1]=temp;
		j++;
	}
	for(int i=0;i<s.length();i++)
	{
	System.out.print(a[i]);
}
}
}