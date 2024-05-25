public class PayPal implements PaymentMethod{
    @Override
    public void ProcessPayment() {
        System.out.println("Usted esta pagando con PayPal");
    }
}
