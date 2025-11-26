package Database_Connection_JDBC;

public class App {
	public static void main(String[] args) {
		DBConnection connection = DBConnection.getInstance();
		System.out.println(connection.hashCode());
//
		DBConnection connection1 = DBConnection.getInstance();
		System.out.println(connection1.hashCode());

		DBConnection connection2 = DBConnection.getInstance();
		System.out.println(connection2.hashCode());

//		Shape shapeFactory = ShapeFactory.getShape("circle");
//		shapeFactory.draw();

		// Abstract Factory design pattern
//
//		GUIFactory factory = new WinFactory();
//		Button button = factory.createButton();
//		CheckBox box = factory.createCheckBox();
//
//		button.click();
//		box.check();
//
//		GUIFactory factory2 = new MacFactory(); 
//		Button button2 = factory2.createButton();
//		CheckBox box2 = factory2.createCheckBox();
//		
//		button2.click();
//		box2.check();

//		BuilderDesignPattern

//		Pizza pizza = new Pizza.Builder("Medium").cheese(true).olives(false).build();
//		System.out.println(pizza);

//		Pizza pizza2 = new Pizza("Large", true, true);

		DrinkMaker tea = new TeaMaker();
		tea.prepareDrink();

	}
}
