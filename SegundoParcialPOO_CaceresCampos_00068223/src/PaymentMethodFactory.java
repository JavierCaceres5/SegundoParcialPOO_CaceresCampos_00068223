public class PaymentMethodFactory {
    public static PaymentMethod getPaymentMethod(String type){
        switch (type){
            case "PayPal":
                return new PayPal();

            case "n1co":
                return new n1co();

            default:
                throw new IllegalArgumentException("Unknown payment gateway");
    }
    }
}
