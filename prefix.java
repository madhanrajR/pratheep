	import java.util.*;
public class prefix {
public static void main(String ar[])throws Exception
	{
	Scanner in=new Scanner(System.in);
	int n,j;
	n=in.nextInt();
	String input[]=new String[100];
	for(int j=0;j<n;j++)
	{
	input[j]=in.next();
	}
	String long,check;
	if(input.length>0)
	long=input[0];
	for(int i=1;i<input.length;i++)
	{
	check=input[i];
	for(j=0;j<Math.min(long.length(),input[i].length());j++)
	{
	if(long.charAt(j)!=check.charAt(j))
	break;
	}
	long=input[i].subString(0,j);
	}
	System.out.println("longest prefix found is:"+long);
	}
	}

	}
