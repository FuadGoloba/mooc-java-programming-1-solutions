

public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account FuadAccount = new Account("Fuad's account", 100.00);
        
        //System.out.println("Initial state");
        //System.out.println(FuadAccount);
        FuadAccount.deposit(20.00);
        //System.out.println("The balance on Fuad's Account is now:" + FuadAccount.saldo());
        System.out.println(FuadAccount.saldo());
        
    }
}
