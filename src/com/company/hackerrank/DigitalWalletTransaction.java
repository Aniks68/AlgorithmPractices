package com.company.hackerrank;

public class DigitalWalletTransaction {

    public void addMoney(DigitalWallet wallet, int amount) throws TransactionException {
        System.out.println("Adding money to wallet. Present balance: " + wallet.getWalletBalance());
        if (wallet.getUserAccessToken() == null) {
            throw new TransactionException("User not authorized", "USER_NOT_AUTHORIZED");
        } else if (amount < 0) {
            throw new TransactionException("Amount should be greater than zero", "INVALID_AMOUNT");
        } else {
            wallet.setWalletBalance(wallet.getWalletBalance() + amount);
            System.out.println("Amount added successfully. Balance: " + wallet.getWalletBalance());
        }
    }

    public void payMoney(DigitalWallet wallet, int amount) throws TransactionException {
        System.out.println("Paying money from wallet. Present balance: " + wallet.getWalletBalance());
        if (wallet.getUserAccessToken() == null) {
            throw new TransactionException("User not authorized", "USER_NOT_AUTHORIZED");
        } else if (amount > wallet.getWalletBalance()) {
            throw new TransactionException("Insufficient balance", "INSUFFICIENT_BALANCE");
        } else {
            wallet.setWalletBalance(wallet.getWalletBalance() - amount);
            System.out.println("Amount paid successfully. Balance: " + wallet.getWalletBalance());
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        DigitalWallet wallet = new DigitalWallet("123", "John");
        DigitalWallet wallet1 = new DigitalWallet("123", "John", "EDFTYH");
        DigitalWalletTransaction transaction = new DigitalWalletTransaction();
        try {
            transaction.addMoney(wallet1, 100);
            System.out.println(wallet.getWalletBalance());
            transaction.payMoney(wallet1, 50);
            System.out.println(wallet1.getWalletBalance());
        } catch (TransactionException e) {
            System.out.println(e.getMessage());
        }
    }
}
