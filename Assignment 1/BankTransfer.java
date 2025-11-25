public class BankTransfer extends Payment{
    private String bankName;
    private String accountNumber;
    private String referenceCode;

    public BankTransfer(double amount, String currency, String bankName, String accountNumber, String referenceCode) {
        super(amount, currency);
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.referenceCode = referenceCode;
    }

    @Override
    public void processPayment() {
        System.out.println("Initiating bank transfer to" +bankName+ "using account" +accountNumber+ "with reference" +referenceCode);

        markAsComplete();
    }
}
