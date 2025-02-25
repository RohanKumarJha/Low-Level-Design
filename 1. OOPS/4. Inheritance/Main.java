public class Main {
    public static void main(String[] args) {
        BankAccount object1 = new BankAccount();
        object1.deposit(2500);
        System.out.println(object1.balance);
        object1.withdraw(2000);
        System.out.println(object1.balance);

        SavingAccount object2 = new SavingAccount();
        object2.addInterest();
        System.out.println(object2.balance);
    }
}
