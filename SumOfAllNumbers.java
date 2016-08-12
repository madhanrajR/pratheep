public class SumOfAllNumbers
{ 
public static int output1; 
public static int output2;
public static void main(String [] args)
{
int[] arr = new int[]{-18,13,-18,-15};
findOriginalFirstAndSum(arr);
}
public static void findOriginalFirstAndSum(int [] input1)
{ 
	int[] b=new int[input1.length];
	int c=0;
	b[input1.length-1]=input1[input1.length-1];
	for(int i=input1.length-2;i>=0;i--)
	{
		b[i]=b[i+1]-input1[i];
	}
	for(int i=0;i<input1.length;i++)
	{
		c=b[i]+c;
	}
output1=b[0];

output2= c;

System.out.println(output1+" "+output2);
} 
}