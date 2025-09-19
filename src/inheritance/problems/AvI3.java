package inheritance.problems;

abstract class DigitalPayment {
    abstract void showCashbackOffer();
}

interface PaymentMode {
    void pay();
}

class UPIPayment extends DigitalPayment implements PaymentMode {
    void showCashbackOffer() {
        System.out.println("20% cashback on UPIPayment.");
    }

    public void pay() {
        System.out.println("Your payment through UPI have done.");
    }
}

class CardPayment extends DigitalPayment implements PaymentMode {
    void showCashbackOffer() {
        System.out.println("10% cashback on card payment.");
    }

    public void pay() {
        System.out.println("Your payment through card have done.");
    }
}

public class AvI3 {
    public static void main(String[] main) {

        DigitalPayment paymentObj;
        PaymentMode pMode;

        paymentObj = new UPIPayment();
        paymentObj.showCashbackOffer();
        pMode = (PaymentMode)paymentObj;
        pMode.pay();

        paymentObj = new CardPayment();
        paymentObj.showCashbackOffer();
        pMode = (PaymentMode)paymentObj;
        pMode.pay();
    }
}
