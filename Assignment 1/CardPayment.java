public class CardPayment extends Payment{
    protected String cardNumber;
    protected String cardholderName;
    protected String expiryDate;

    public CardPayment(double amount, String currency, String cardNumber, String cardholderName, String expiryDate) {
        super(amount, currency);
        this.cardNumber = cardNumber;
        this.cardholderName = cardholderName;
        this.expiryDate = expiryDate;
    }



    @Override
    public void processPayment() {
        System.out.println("Authorizing card payment for" +cardholderName);
    }

    public void validateCard() {
        System.out.println("Validating card number format.");
    }
}
