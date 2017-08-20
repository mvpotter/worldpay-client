package com.mvpotter.worldpay.client.model.transaction;

/**
 * @author mvpotter
 * @since 12/08/2017
 */
public class TransactionAccount {

    /**
     * account name of the bank account.
     */
    private String accountName;

    /**
     * account type of the bank account.
     */
    private String accountType;

    /**
     * last 4 digits of the bank account number.
     */
    private String accountNumber;

    /**
     * @return {@link #accountName}
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * @param accountName {@link #accountName}
     */
    public void setAccountName(final String accountName) {
        this.accountName = accountName;
    }

    /**
     * @return {@link #accountType}
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * @param accountType {@link #accountType}
     */
    public void setAccountType(final String accountType) {
        this.accountType = accountType;
    }

    /**
     * @return {@link #accountNumber}
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber {@link #accountNumber}
     */
    public void setAccountNumber(final String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "TransactionAccount{" +
                "accountName='" + accountName + '\'' +
                ", accountType='" + accountType + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }

}
