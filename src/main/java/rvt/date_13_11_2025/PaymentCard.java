package rvt.date_13_11_2025;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance=openingBalance;
    }

    public String toString() {
        return "The card has a balance of "+balance+" EUR";
    }
    public void eatAffordably() {
        if (balance-2.60>=0) {
            balance=balance-2.60;
        } else {System.out.println("(AFFORDABLY) The transaction was cancelled due to insufficient funds.");}
    }
    
    public void eatHeartily() {
        if (balance-4.60>=0) {
            balance=balance-4.60;
        } else {System.out.println("(HEARTILY) The transaction was cancelled due to insufficient funds.");}
    }
    public void addMoney(double money) {
        if (balance+money<=150) {
            balance=balance+money;
        } else {
            balance=150;
        }
    }
}
