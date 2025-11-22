package Day_Two_Mphasis;

public class UPI implements Payment {
	@Override
	public void payment(double amount) {
		if (Payment.validateAmount(amount)) {
			System.out.println("Amount paid " + amount + " using UPI");
			generateReceipt(amount);
		} else {
			System.out.println("Payment failed");
		}
	}
	
	@Override
	public void generateReceipt(double amount) {
		System.out.println("Payment option : UPI");
		Payment.super.generateReceipt(amount);
	}
}
