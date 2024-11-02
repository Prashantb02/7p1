package java_seminar;

public class OuterClass {
	private int x=10;
	
	//member ionner clsss
    public class InnerClass{
    	public void printX() {
    		System.out.println(x);
    	}
    }
    
    //local inner class
    public void method() {
    	class LocalInnerClass{
    		public void printX() {
    			System.out.println(x);
    		}
    	}
    	LocalInnerClass lic = new LocalInnerClass();
    	lic.printX();
    }
    //anonymous inner class
    public Runnable getRunnable() {
    	return new Runnable() {
    		public void run() {
    			System.out.println(x);
    		}
    	};
    }
    //static inner class
    public static class StaticInnerClass{
    	public static void printX(OuterClass oc) {
    		System.out.println(oc.x);
    	}
    }
	

}
