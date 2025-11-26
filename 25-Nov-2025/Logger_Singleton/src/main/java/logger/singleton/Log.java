package logger.singleton;

public class Log {
	private static Log log;
	private Log(String msg) {
		System.out.println("Log maintaing...." + msg);
	}

	public static Log log(String msg) {
		if (log != null) {
			return log;
		}
		return log = new Log(msg);
	}
}
