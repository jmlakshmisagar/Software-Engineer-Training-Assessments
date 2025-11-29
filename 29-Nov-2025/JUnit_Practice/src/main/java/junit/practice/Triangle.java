package junit.practice;

public class Triangle implements Shape {

	@Override
	public Shape type() {
		return new Triangle();
	}

}
