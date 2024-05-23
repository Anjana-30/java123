package assignment2;

public class palindrom {

	public static void main(String[] args) {
		int m,rev=0,x;
		
		System.out.println("enter a number");
		int n;
		
		
		m=n;
		while(n!=0)
		{
			x=n%10;
			rev = rev*10+x;
			n=n/10;
			
		}
        if(rev == m)
        	System.out.println(m+ "is a palindrom" );
        else
        	System.out.println(m+ "is  not a palindrom" );
        	
	}

}
