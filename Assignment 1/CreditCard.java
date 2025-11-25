public class CreditCard extends CardPayment{
    private double creditLimit;

    public CreditCard(double amount,String currency, String cardNumber,String cardholderName ,String expiryDate, double creditLimit) {
        super(amount,currency,cardNumber,cardholderName,expiryDate);
        this.creditLimit = creditLimit;
    }

    @Override
    public void processPayment() {
        System.out.println("Charging credit card with limit" +creditLimit+ "for amount" +amount);
    }

    public void applyInterest() {
        System.out.println("Applying interest if payment is not settled by due date.");
    }
}
