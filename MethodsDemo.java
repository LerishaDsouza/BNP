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

	void setSecondNum(int secondNum)
	{
		this.secondNum = secondNum;
	}

	String getFirstNum()
	{
		return this.firstNum;
	}

	String getSecondNum()
	{
		return this.secondNum;
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
		setSecondNum(secondNum);
		add();
	}

	void displayOutput(int result){
		System.out.println("Addition : " + result);
	}




}