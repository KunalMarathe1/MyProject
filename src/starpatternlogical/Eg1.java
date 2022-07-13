package starpatternlogical;

public class Eg1 {

	public static void main(String[] args) {
		
		sir("*");
		
		
		
	}
	public static void sir(String name)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(name);
			}
			System.out.println();
		}
	}

}
