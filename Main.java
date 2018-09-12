import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Competition("one"));
		Thread t2 = new Thread(new Competition("two"));
		Thread t3 = new Thread(new Competition("three"));
		Thread t4 = new Thread(new Competition("four"));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	
}
