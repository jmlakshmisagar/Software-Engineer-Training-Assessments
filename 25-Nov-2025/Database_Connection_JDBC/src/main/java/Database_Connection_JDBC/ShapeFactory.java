package Database_Connection_JDBC;

public class ShapeFactory {
	public static Shape getShape(String type) {
		if (type == "circle") {
			return new Circle();
		} else if (type == "square") {
			return new Square();
		}
		return null;
	}
}
