package branching;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		

Scanner reader = new Scanner(System.in);

System.out.println("enter a number");
int n= reader.nextInt();

if(n % 2 == 0)
System.out.println("number is even:" + n);
else
	System.out.println("number is odd:" +n);
	
	
	}

}
