package Database_Connection_JDBC;

public class TeaMaker extends DrinkMaker {

	@Override
	void makeDrink() {
		System.out.println("Tea Made...");
	}

	@Override
	void addExtras() {
		System.out.println("Extra Ginger Added...");
	}

}
