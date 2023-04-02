public class Main {
    public static void main(String[] args) {

        Customer bob = new Customer("Bob", 1000.0);
        System.out.println(bob);

        Bank bank = new Bank("Ziraat Bankasi");
        bank.addNewCustomer("Jane A.", 500.0);
        bank.addTransaction("Jane A.", -10.25);
        bank.addTransaction("Jane A.", -75.01);
        bank.printStatement("Jane A.");


        System.out.println(bank);

    }
}