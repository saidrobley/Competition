import java.util.Comparator;
import java.util.Random;

public class Competition implements Runnable {
	private String name;
	private int time;
	public Competition(String name){
		this.name = name;
		time = new Random().nextInt(5000);
	}
	
	@Override
	public void run() {
		try{
			System.out.printf("%s is sleeping for %d\n", name, time);
			Thread.sleep(time);
			System.out.printf("%s is awake\n", name);
			
		} catch (Exception e){
		
		}
	
	}
}
