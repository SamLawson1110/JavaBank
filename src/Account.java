//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Account implements InterfaceBankAccount {

    public String getBankName(){
        return InterfaceBankAccount.BANK;
    }
    String accountName;
    int accountNum;
    int balance;

    Account() {
        this.accountName = "EMPTY";
        this.accountNum = 0;
        this.balance = 0;
    }

    Account(String name, int num, int amt) {
        this.accountName = name;
        this.accountNum = num;
        this.balance = amt;
    }

    public void deposit(int amt) {
        this.balance += amt;
    }

    public void withdraw(int amt) {
        this.balance -= amt;
    }

    public void setAccountName(String name) {
        this.accountName = name;
    }

    public void setAccountNum(int num) {
        this.accountNum = num;
    }

    public void setBalance(int num) {
        this.balance = num;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public int getAccountNum() {
        return this.accountNum;
    }

    public int getBalance() {
        return this.balance;
    }

    public void print() {
        System.out.println("Bank Name: " + getBankName() +
                            "\nAccount Holder: " + accountName +
                            "\nAccount Number: " + accountNum +
                            "\nAccount Balance: " + balance);
    }
}
