package junit.practice;

public class Circle implements Shape {

	@Override
	public Shape type() {
		return new Circle();
	}

}
