package proxy.design.pattern;

public class App {
    public static void main(String[] args) {
        Payment netBanking = new NetBanking();
        netBanking.pay(5000);
        System.out.println();
        Payment upiPayment = new UPIPayment();
        upiPayment.pay(6000);
    }
}
