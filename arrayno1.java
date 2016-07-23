import java.util.Scanner;


public class arrayno1 {
public static void main(String[] args) {
	int a[]=new int[10];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the digit:");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++)
	{
	 for(int j=i+1;j<a.length;j++)
	 {
		 if(a[i]+a[j]==0)
		 {
			 System.out.println("the no:"+a[i]+"\t"+a[j]);
		 }
	 }
	}
}
}
