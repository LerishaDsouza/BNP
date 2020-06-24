class ThreadSleep extends Thread{
	public static void main(String[] args){
		ThreadSleep ref = new ThreadSleep();

		ref.setName("");
		ref.start();
		

	}
	@Override
	public void run(){

		int i = 0;
			

		while(i >= 0){

			System.out.print(i);
			System.out.print("\r");
			i++;
			try{

			Thread.sleep(2000);

			}catch(InterruptedException ie){

				System.out.println("Someone just interrupted me :(");
			}
		}

			
	}
	
	
}

