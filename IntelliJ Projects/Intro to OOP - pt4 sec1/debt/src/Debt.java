public class Debt {
    private double balance = 0;
    private double interest_rate = 0;
    private String account_name = "";
    public Debt(String initialName, double initialBalance, double initialInterestRate) {
        this.account_name = initialName;
        this.balance = initialBalance;
        this.interest_rate = initialInterestRate;
    }

    public void printBalance() {
        System.out.println(this.account_name + ": £" + this.balance);
    }

    public void waitOneYear() {
        this.balance *= this.interest_rate / 100 + 1;
    }
}
