package Assignment1.exemplu5;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<Account>();
    }

    public ArrayList <Account> conturi (){
        return accounts;
    }
    public void addAccount(Account account){
        accounts.add(account);
    }

    public void removeAccount(Account account){
        accounts.remove(account);
    }

    public void deposit(Account account , double value){
        account.deposit(value);
    }

    public void withdraw(Account account , double value){
        account.withdraw(value);
    }


}
