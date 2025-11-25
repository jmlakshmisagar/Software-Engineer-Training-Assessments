package Database_Connection_JDBC;

public class CoffeeMaker extends DrinkMaker {

	@Override
	void makeDrink() {
		System.out.println("Made Coffee..");
	}

	@Override
	void addExtras() {
		System.out.println("Sugar Added..");
	}

}
