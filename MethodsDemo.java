class MethodsDemo{

	private int firstNum;

	private int secondNum;

	public static void main(String[] args) {

		
		
		new MethodsDemo().takeInput();
	}

	void setFirstNum(int firstNum)
	{
		this.firstNum = firstNum;
	}

	void setSecondName(int secondNum)
	{
		this.secondNum = secondNum;
	}


	void add(){
		

		int result = firstNum + secondNum;
		displayOutput(result);
	}

	void takeInput(){
		java.util.Scanner scan = new java.util.Scanner(System.in);

		int firstNum = scan.nextInt();
		int secondNum = scan.nextInt();

		setFirstNum(firstNum);
		setSecondName(secondNum);
		add();
	}

	void displayOutput(int result){
		System.out.println("Addition : " + result);
	}




}