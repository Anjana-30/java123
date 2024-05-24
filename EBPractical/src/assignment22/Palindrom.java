package assignment22;

public class Palindrom {

	public static void main(String[] args)
	{
		 
	       
	        int num = 10;
	        int temp,rev=0,remainder;

	         temp = num;
	        
	        while (num != 0) 
	        {
	            remainder = num % 10;
	             rev= rev * 10 + remainder;
	            num=num/10;
	        }

	        if (temp == rev) 
	           
	        	System.out.println(temp + " is a palindrome.");
	        else 
	        
	            System.out.println(temp + " is not a palindrome.");

	}
}

