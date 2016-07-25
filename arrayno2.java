import java.util.Scanner;


public class arrayno2 {
	public static void main(String[] args) {
		int[] a=new int[7];
		Scanner nc =new Scanner(System.in);
		System.out.println("enter the digit:");
		for(int d=0;d<a.length;d++)
		{
			a[d]=nc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[i]=0;
					a[j]=0;
				}
				
			}
		}
		for(int e=0;e<a.length;e++)
		{
			if(a[e]!=0)
			{
				System.out.println("return:"+a[e]);
			}
		}
		
		}
}
