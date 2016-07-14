
	import java.util.Scanner;

	public class Factorial {

	    public static void main(String[] args) {
	    
	          System.out.println("Enter a number");
	      Scanner ob=new Scanner(System.in);
	 int num=ob.nextInt();

	        int result=fact(num);
	        System.out.println(result);
	    }
	  static  int fact(int num)
	    {
	        int result;
	        if(num<=1)
	                {
	                return 1;
	                }
	        else
	        {
	            result=num*fact(num-1);
	        }
	        return result;
	    }
	}

