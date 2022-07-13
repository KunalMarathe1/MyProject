package logicalprogram;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String name = sc.next();
		String rev="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println("Actual String "+name);
		System.out.println("Reverse String "+rev);
		
		if(name.equals(rev))
		{
			System.out.println("Palindrome String");
		}
		else
		{
			System.out.println("Not Palindrome String");
		}
		
		
	}

}
