package Day_Two_Mphasis;

public interface Payment {
	public abstract void payment(double amount);

	public default void generateReceipt(double amount) {
		System.out.println("Receipt generated succesfully for the amount :" + amount);
	}

	public static boolean validateAmount(double amount) {
		return amount > 0;
	}
}
