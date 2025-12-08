package practice.two;

public class Tth extends Thread {
	public static void main(String[] args) {
		Thread thread = new Thread();
		thread.run();
		System.err.println(thread.isAlive());
	}
}
