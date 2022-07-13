package starpatternlogical;

public class Eg2
{
	public static void main(String[] args) 
	{
		sir();
		kunal();
	}
	public static void sir()
	{
		int star=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
		}
	}
	
	public static void kunal()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
