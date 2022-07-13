package starpatternlogical;

public class Eg8 {

	public static void main(String[] args) {
		int star1;
		int space=3;
		
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
