package java_seminar;
class Game{
	public void type() {
		System.out.println("Indoor & Outdoor");
	}
}
public class Cricket extends Game {
    public void type() {
    	System.out.println("Outdoor game");
    }
    public static void main(String args[]) {
    	Game gm=new Game();
    	Cricket ck=new Cricket();
    	gm.type();
    	ck.type();
    	gm=ck;
    	gm.type();
    	
    	
    }
}
