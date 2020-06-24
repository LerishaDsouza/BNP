package pallindrome;
class Pallindrome{
	public static void main(String[] args){

		System.out.println("Enter the string");

		String b = "";

		String s = new java.util.Scanner(System.in).nextLine();

		for(int i = s.length() - 1 ;i >= 0; i--){

			b = b + s.charAt(i);	
	
		}

		if(s.equalsIgnoreCase(b)){

			System.out.println("This is a pallindrome");
		}

		else{

			System.out.println("It is not a pallindrome");
		}


	}
}