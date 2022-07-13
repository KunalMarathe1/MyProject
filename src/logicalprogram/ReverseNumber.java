package logicalprogram;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int number = sc.nextInt();
		int rev=0;
		for(int i=number;i>0;i=i/10) //123 //12 //1  //
		{
			int rem=i%10;      // 3 //2  //1
			rev=rev*10+rem;    //321
		}
		System.out.println("Reverse Number is "+rev);
		
	}

}
