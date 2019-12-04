public class SavingAccount {
    private static double annualInterestRate;
    private double savingBalance;

    public SavingAccount(){
        this.annualInterestRate = 0;
        this.savingBalance = 0;
    }
    public SavingAccount(double IntRate ,double balance){
        annualInterestRate = IntRate;
        savingBalance = balance;
    }

    public double calculateMonthlyInterest(){
        double IntRate = savingBalance*annualInterestRate/12;
        savingBalance =(savingBalance+IntRate);
        return annualInterestRate;
    }

    public static void modifyInterestRate(double newIntRate){
        annualInterestRate = newIntRate;
    }

    public void setSavingBalance(double newBalance) {
        savingBalance = newBalance;
    }
    public double getSavingBalance(){
        return savingBalance;
        }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
}
