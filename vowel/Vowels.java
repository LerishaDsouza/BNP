package vowel;
class Vowels{
	public static void main(String[] args){

		int c = 0;

		System.out.println("Enter the string");

		String s= new java.util.Scanner(System.in).nextLine();

		for(int i =0; i < s.length(); i++){

			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){

				c += 1;


			}
		}

		System.out.println("The number of vowels present is : " + c);
	}
}