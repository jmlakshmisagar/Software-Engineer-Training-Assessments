package junit.practice;

public class App {
	public String sayHello() {
		return "Hello";
	}

	public static void main(String[] args) {
		App app = new App();
		System.out.println(app.sayHello());
	}
}
 