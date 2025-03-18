interface PaymentMethod {
    void pay(double amount);
}

class CreditCardPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

class PayPalPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}

class BitcoinPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Bitcoin.");
    }
}

class PaymentProcessor {
    private PaymentMethod paymentMethod;

    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(double amount) {
        paymentMethod.pay(amount);
    }
}

public class ProtectedVariation {
    public static void main(String[] args) {
        PaymentProcessor creditCardProcessor = new PaymentProcessor(new CreditCardPayment());
        creditCardProcessor.processPayment(100.0);

        PaymentProcessor payPalProcessor = new PaymentProcessor(new PayPalPayment());
        payPalProcessor.processPayment(50.0);

        PaymentProcessor bitcoinProcessor = new PaymentProcessor(new BitcoinPayment());
        bitcoinProcessor.processPayment(30.0);
    }
}
