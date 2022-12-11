package com.company.hackerrank;

public class DigitalWallet {
    private String walletId;
    private String userName;
    private String userAccessToken;

    private int walletBalance;

    public DigitalWallet(String walletId, String userName) {
        this.walletId = walletId;
        this.userName = userName;
    }

    public DigitalWallet(String walletId, String userName, String userAccessCode) {
        this.walletId = walletId;
        this.userName = userName;
        this.userAccessToken = userAccessCode;
    }

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAccessToken() {
        return userAccessToken;
    }

    public void setUserAccessToken(String userAccessToken) {
        this.userAccessToken = userAccessToken;
    }

    public int getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(int walletBalance) {
        this.walletBalance = walletBalance;
    }

    @Override
    public String toString() {
        return "DigitalWallet{" +
                "walletId='" + walletId + '\'' +
                ", userName='" + userName + '\'' +
                ", userAccessCode='" + userAccessToken + '\'' +
                '}';
    }
}
