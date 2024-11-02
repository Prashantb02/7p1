package java_seminar;

class Multi extends Thread{
	public void run() {                            //run method declared
		System.out.println("thread is running...");
	}

	public static void main(String[] args) {
		Multi t1=new Multi();
		t1.start();                        //run method called through start()

	}

}
//runnable is predined interfce
