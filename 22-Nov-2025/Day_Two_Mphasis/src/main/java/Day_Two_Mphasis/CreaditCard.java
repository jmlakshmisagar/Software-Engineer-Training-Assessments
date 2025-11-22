package Day_Two_Mphasis;

public class CreaditCard implements Payment {

	@Override
	public void payment(double amount) {
		if (Payment.validateAmount(amount)) {
			System.out.println("Amount paid " + amount + " using creditcard");
			generateReceipt(amount);
		} else {
			System.out.println("Payment failed");
		}
	}

}
