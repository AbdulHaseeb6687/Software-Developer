interface PaymentOption {
    void executePayment(double total);
}

class CardPayment implements PaymentOption {
    public void executePayment(double total) {
        System.out.println("Paid $" + total + " using Card.");
    }
}

class DigitalWalletPayment implements PaymentOption {
    public void executePayment(double total) {
        System.out.println("Paid $" + total + " using Digital Wallet.");
    }
}

class CryptoPayment implements PaymentOption {
    public void executePayment(double total) {
        System.out.println("Paid $" + total + " using Cryptocurrency.");
    }
}

class TransactionHandler {
    private PaymentOption option;

    public TransactionHandler(PaymentOption option) {
        this.option = option;
    }

    public void handlePayment(double total) {
        option.executePayment(total);
    }
}

public class NoProtectedVariation {
    public static void main(String[] args) {
        TransactionHandler cardHandler = new TransactionHandler(new CardPayment());
        cardHandler.handlePayment(100.0);

        TransactionHandler walletHandler = new TransactionHandler(new DigitalWalletPayment());
        walletHandler.handlePayment(50.0);

        TransactionHandler cryptoHandler = new TransactionHandler(new CryptoPayment());
        cryptoHandler.handlePayment(30.0);
    }
}

class CardPaymentBasic {
    public void executePayment(double total) {
        System.out.println("Paid $" + total + " using Card.");
    }
}

class WalletPaymentBasic {
    public void executePayment(double total) {
        System.out.println("Paid $" + total + " using Wallet.");
    }
}

class BasicTransactionHandler {
    private CardPaymentBasic cardPay = new CardPaymentBasic();
    private WalletPaymentBasic walletPay = new WalletPaymentBasic();

    public void handlePayment(String option, double total) {
        if (option.equals("Card")) {
            cardPay.executePayment(total);
        } else if (option.equals("Wallet")) {
            walletPay.executePayment(total);
        } else {
            System.out.println("Invalid payment option.");
        }
    }
}
