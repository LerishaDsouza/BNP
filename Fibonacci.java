class Fibonacci
{
	public static void main(String[] args)
	{

	System.out.println("Enter the number of termms");
	
	int n = new java.util.Scanner(System.in).nextInt();
	
	int a = 0, b = 1;

	System.out.print(b + " ");
	
	for(int i = 1; i <= n; i++)
	{
	
	int z = a + b;

	System.out.print(z + " ");

	a = b;

	b = z;

	
	}
	}
}