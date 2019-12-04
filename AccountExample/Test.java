import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        SavingAccount saver1 = new SavingAccount();
        SavingAccount saver2 = new SavingAccount();

        saver1.setSavingBalance(2000.00);
        saver2.setSavingBalance(3000.00);

        SavingAccount.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("New Balance for Saver1 = "+saver1.getSavingBalance());
        System.out.println("New Balance for Saver2 = "+saver2.getSavingBalance());

        SavingAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("New Balance for Saver1="+saver1.getSavingBalance());
        System.out.println( "New Balance for Saver2="+saver2.getSavingBalance());

    }

}
