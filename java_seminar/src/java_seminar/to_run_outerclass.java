package java_seminar;

public class to_run_outerclass {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();

        // Member Inner Class
        OuterClass.InnerClass ic = oc.new InnerClass();
        ic.printX(); // Output: 10

        // Local Inner Class
        oc.method(); // Output: 10

        // Anonymous Inner Class
        Runnable r = oc.getRunnable();
        r.run(); // Output: 10

        // Static Inner Class
        OuterClass.StaticInnerClass.printX(oc); // Output: 10

	}

}
//refrencing normal variable of class with this keyword
