public class DebitCard extends CardPayment{
    private double availableBalance;


    public DebitCard(double amount, String currency,String cardNumber, String cardholderName,String expiryDate, double availableBalance) {
        super(amount, currency, cardNumber, cardholderName,expiryDate);
        this.availableBalance = availableBalance;
    }

    @Override
    public void processPayment() {
        System.out.println("Debiting from the account balance" +availableBalance+ "for amount" +amount);
        validateCard();
    }

    public void checkSufficientBalance() {
        System.out.println("Checking if balance covers amount");
    }
}
