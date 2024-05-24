package assignment1;

public class Prime 
{

	public static void main(String[] args)
	{
		
	        int n = 1;
	        
	        if(n == 1) 
	        {
	            System.out.println("IT IS NOT PRIME");
	            return;
	        }
	        
	        for(int i=2;i<n;i++) {
	            if(n % i == 0) 
	            {
	                System.out.println(" IT IS NOT PRIME");
	                return;
	            }
	        }
	        
	        System.out.println(" IT IS PRIME");
	    }
	}


	


