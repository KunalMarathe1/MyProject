package logicalprogram;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int number = sc.nextInt();
		int arm=0;
		for(int i=number;i>0;i=i/10)
		{
			int rem=i%10;
			arm=arm+(rem*rem*rem);
		}
		if(number==arm)
		{
			System.out.println("Arm Strong Number "+arm);
		}
		else
		{
			System.out.println("Not Arm Strong Number "+arm);
		}

	}

}
