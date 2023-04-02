public class Main {
    public static void main(String[] args) {

        Account bobsAccount = new Account("111111", 500,"Bob Marley", "bob@test.com", "1234567");
        Account betulsAccount = new Account();
        Account timsAccount = new Account("tim", "tim@test.com", "123456789");

        System.out.println(bobsAccount.getCustomerName() + " has $" + bobsAccount.getAccountBalance());
        bobsAccount.withdrawFunds(100);
        System.out.println(bobsAccount.getCustomerName() + " has $" + bobsAccount.getAccountBalance());
        bobsAccount.depositFunds(300);
        System.out.println(bobsAccount.getCustomerName() + " has $" + bobsAccount.getAccountBalance());

        System.out.println(betulsAccount.getCustomerName());

        System.out.println(timsAccount.getAccountNumber());

    }
}