package branching;

import java.util.Scanner;

public class vowels {
	
public static void main(String args[])
{
	System.out.println("enter a character");
	
	Scanner sc = new Scanner(System.in);

	
	char ch= sc.next().charAt(0);
	if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch ==' ')
		System.out.println("given character is vowel");
	else
		System.out.println("given character is constand");
	}
}
