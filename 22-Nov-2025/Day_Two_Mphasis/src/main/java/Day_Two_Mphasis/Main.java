package Day_Two_Mphasis;

public class Main {

	public static void main(String[] args) {
		CreaditCard creaditCard = new CreaditCard();
		creaditCard.payment(4500);
		
		UPI upi = new UPI();
		upi.payment(50); 
	}

}


// write a labda expresiion to print ur name using a functional interface with a method name printname