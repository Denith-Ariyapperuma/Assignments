import java.util.ArrayList;
import java.util.List;

public class PaymentTest {
    public static void main(String[] args) {

        Payment cod = new CashOnDelivery(5000, "LKR", "Malabe");
        Payment bank = new BankTransfer(10000, "LKR", "BOC", "1222222","REF1234");
        Payment credit = new CreditCard(8000, "LKR", "1111-2222-3333-4444", "Kamal","02/27",5000);
        Payment debit = new DebitCard(20000, "LKR", "5555-4444-6666-7777", "Niaml","04/12",100000);

        //Individual calls
        cod.processPayment();
        cod.generateReceipt();

        bank.processPayment();
        bank.generateReceipt();

        credit.processPayment();
        credit.generateReceipt();

        debit.processPayment();
        debit.generateReceipt();

        System.out.println();

        List<Payment> payments = new ArrayList<>();
        payments.add(cod);
        payments.add(bank);
        payments.add(credit);
        payments.add(debit);

        for (Payment p : payments) {
            p.processPayment();
        }
    }
}
