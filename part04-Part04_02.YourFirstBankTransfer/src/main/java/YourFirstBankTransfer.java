
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account MatthewAccount = new Account("Matthews Account", 1000.0);
        Account MyAccount = new Account("My account", 0.0);
        
        MatthewAccount.withdrawal(100.0);
        MyAccount.deposit(100.00);
        
        System.out.println(MatthewAccount);
        System.out.println(MyAccount);
    }
}
