public class Main {
    public static void main(String[] args) {
        PaymentMethod paymentMethod;
        paymentMethod = PaymentMethodFactory.getPaymentMethod("PayPal");
        paymentMethod = PaymentMethodFactory.getPaymentMethod("n1co");

    }
}

