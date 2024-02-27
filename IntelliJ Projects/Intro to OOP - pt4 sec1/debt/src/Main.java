public class Main {
    public static void main(String[] args) {
        Debt account1 = new Debt("uno", 1000, 1.5);
        Debt account2 = new Debt("due", 550, 8);

        for (int i=0; i<10; i++) {
            System.out.println("Year " + (i+1) + ":");
            account1.printBalance();
            account2.printBalance();
            System.out.println("");
            account1.waitOneYear();
            account2.waitOneYear();
        }

    }
}