package logicalprogram;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int number = sc.nextInt();
		int rev=0;
		for(int i=number;i>0;i=i/10)
		{
			int rem=i%10;
			rev=rev*10+rem;
		}
		
		if(number==rev)
		{
			System.out.println("Palindrome NUmber "+rev);
		}
		else
		{
			System.out.println("Not Palindrome NUmber "+rev);
		}

	}

}
