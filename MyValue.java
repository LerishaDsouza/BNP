class MyValue{

	public static void main(String[] args){

		System.out.println("Enter the number");

		int v = new java.util.Scanner(System.in).nextInt();
	
		int i, f = 1;

		for(i=v;i >= 1; i=i-1 ){
	
		f = f*i;

		}

		System.out.println("The factorial of a number is:"+f);
	
	}
}