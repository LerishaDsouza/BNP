class Caluculate{

	//public int add (int a, void b){
	//	return a + b;
	//}

	//public int add (int a, int b){
	//	return a + b;
	//}

	//double add(double a, int b,double c){
	//	return a + b + c;
	//}

	//float add(float a,int b,int c,int d){
	//	return a + b + c + d;
	//}

	int total;
	int add(int... values){
	//int total;
		if(values.length == 0){
			for(int value : values){
			
				total += value;
	
			}
			
		}

		else
			System.out.println("Zero");

		return total;
	
	}
	//
	int add(String... value){
		for(int values : value){
			total += values;
		}
		return total;
	}

	public static void main(String[] args){
		Caluculate c = new Caluculate();
		System.out.println("Addition is : " + c.add(10,""));
	}

}