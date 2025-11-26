package logger.singleton;

public class ConfigurationManager {
	private static ConfigurationManager configurationManager;

	private ConfigurationManager() {
		System.out.println("App Setting opened..");
	}

	public static ConfigurationManager load() {
		if (configurationManager != null) {
			return configurationManager;
		}
		return configurationManager = new ConfigurationManager();
	}
}
