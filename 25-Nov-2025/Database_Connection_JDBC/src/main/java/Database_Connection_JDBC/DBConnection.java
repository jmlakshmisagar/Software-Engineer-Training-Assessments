package Database_Connection_JDBC;

public class DBConnection {
	private static DBConnection instance;

	private DBConnection() {
		System.out.println("DB Instance Created.....");
	}

	public static DBConnection getInstance() {
		if (instance != null) {
			return instance;
		}
		return instance = new DBConnection();
	}
}
