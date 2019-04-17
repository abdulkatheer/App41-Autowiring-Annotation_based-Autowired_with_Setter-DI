package org.katheer.bean;

import org.springframework.beans.factory.annotation.Required;

public class Account {
    private String accNo;
    private String accName;
    private String bank;
    private String branch;
    private float balance;

    public String getAccNo() {
        return accNo;
    }

    //If not injected, through an excpetion
    @Required
    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getAccName() {
        return accName;
    }

    //If not injected, through an excpetion
    @Required
    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
