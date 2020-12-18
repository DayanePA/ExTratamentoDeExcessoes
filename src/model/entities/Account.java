package model.entities;

import model.exceptions.TratamentoDeExcessoes;

public class Account {

    private Integer number;
    private String holderTitular;
    private Double balance;
    private Double withdrawLimit;

    public Account() {

    }

    public Account(int number, String holderTitular, double balance, double withdrawLimit) {

        this.number = number;
        this.holderTitular = holderTitular;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolderTitular() {
        return holderTitular;
    }

    public void setHolderTitular(String holderTitular) {
        this.holderTitular = holderTitular;
    }

    public Double getBalance() {
        return balance;
    }

//    public void setBalance(Double balance) {
//        this.balance = balance;
//    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) {

        balance += amount;
    }

    public void withdrawSaque(double amount) {
        if (amount > withdrawLimit) {
            throw new TratamentoDeExcessoes("The amount exceeds withdraw limit");
        }
        if (amount> balance) {
            throw new TratamentoDeExcessoes("Not enough balance");
        }

        balance -= amount;

    }

    @Override
    public String toString() {
        return "New balance: " +
                String.format("%.2f", balance);
    }
}



