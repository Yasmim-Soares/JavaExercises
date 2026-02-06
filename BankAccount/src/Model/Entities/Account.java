package Model.Entities;

import Model.exceptions.WithdrawException;

public class Account {
    private int number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(int number, String holder, Double balance, Double withdrawLimit) {
        if(this.balance == 0){
            throw new WithdrawException("Withdraw error: Not enough balance");
        }
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount){
        this.balance += amount;
    }

    public void withdraw(Double amount){
        if(this.balance == 0){
            throw new WithdrawException("Withdraw error: Not enough balance");
        }
        if(amount > this.withdrawLimit){
            throw new WithdrawException("Withdraw error: The amount exceeds withdraw limit");
        }

        this.balance -= amount;
    }
}
