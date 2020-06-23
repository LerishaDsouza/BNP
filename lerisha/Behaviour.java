package lerisha;
import meet.Cry;
class Behaviour{

	public static void main(String[] args){
		Ananya l = new Ananya();
		l.laugh();
	}
}

class Ananya extends Cry{
	void laugh(){
		System.out.println("She is laughing");
		//Cry c = new Cry();
		//c.crying();
		this.crying();
	}



}