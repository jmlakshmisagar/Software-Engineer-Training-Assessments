package proxy.design.pattern;

public class UPIPayment implements Payment {
	private CashPayment cashPayment = new CashPayment();

	@Override
	public void pay(double amount) {
		System.out.println("User validated");
		System.out.println("Id and OTP varification done");
		System.out.println("Payment Successfull");
		cashPayment.pay(amount);
	}

}
