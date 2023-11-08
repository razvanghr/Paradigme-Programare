package Assignment1.exemplu5;

public class Main {
    public static void main(String[] args) {
        /* Write a Java program to create a class called "Bank"
        with a collection of accounts and methods to add and remove
         accounts, and to deposit and withdraw money. Also define
         a class called "Account" to maintain account details of a particular customer. */


        Bank bank= new Bank();

        Account ac1 = new Account("Marian" , 20.20);
        bank.addAccount(ac1);

        Account ac2 = new Account("Mihai" , 200);
        bank.addAccount(ac2);

        Account ac3 = new Account("Dorian" , 50);
        bank.addAccount(ac3);


        System.out.println(bank.conturi());

        bank.withdraw(ac1 , 10);
        bank.withdraw(ac2 , 300);

        bank.deposit(ac3 , 500);


        System.out.println(bank.conturi());

    }
}
