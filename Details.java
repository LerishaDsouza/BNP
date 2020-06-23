class Student{
	int studNo, score;
	String studName, std;

	Student(int studNo, String studName){
		// studNo = studNo;
		this.studNo = studNo;
		this.studName = studName;

		// new Teacher().setStudDetails(this.studNo);
	}

	Student(){

	}

	void setStd(String std){
		this.std = std;

	}

	void setScore(int score){
		this.score = score;
	
	}

	int getStudNo(int studNo){
		return this.studNo;
	}

	int getScore(int score){
		return this.score;
	}

	String getStudname(int studName){
		return this.studName;
	}

	String getStd(int std){
		return this.std;
	}


}

class Details{
	public static void main(String[] args){
		Student sd = new Student(1200, "Akansha");

		Student t = new Student();

		System.out.println(sd.studNo);
		System.out.println(sd.std);
	}
}
