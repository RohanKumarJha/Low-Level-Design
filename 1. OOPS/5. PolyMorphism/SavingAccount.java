public class SavingAccount extends BankAccount {

    private double INTEREST_RATE;

    public void addInterest() {
        balance += balance * INTEREST_RATE;
    }
}
