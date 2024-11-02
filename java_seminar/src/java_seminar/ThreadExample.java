package java_seminar;

public class ThreadExample {

	public static void main(String[] args) {
		MyThread thread1 = new MyThread("Thread-1");
		MyThread thread2 = new MyThread("Thread-2");
		
		//starting the thread
       thread1.start();
       thread2.start();
	}

}
class MyThread extends Thread{
	private String threadName;
	
	MyThread(String name){
		threadName = name;
		System.out.println("Creating"+threadName);
	}
	public void run() {
		System.out.println("Running"+threadName);
		try {
			for(int i=4;i>0;i--) {
				System.out.println("Thread: "+threadName+", "+i);
				//let the thread sleep for a while
				Thread.sleep(50);
			}
		}catch(InterruptedException e) {
			System.out.println("Thread "+threadName+"Interrupted");
		}
		System.out.println("Thread"+threadName+"Exiting");
	}
	public void start() {
		System.out.println("Starting"+threadName);
		super.start();
	}
}

