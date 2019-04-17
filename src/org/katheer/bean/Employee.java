package org.katheer.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Employee {
    private String name;
    private String eid;

    @Autowired(required = true)
    @Qualifier("acc1")
    private Account account;

    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }

    public String getEid() {
        return eid;
    }

    @Required
    public void setEid(String eid) {
        this.eid = eid;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void showEmployeeDetails() {
        System.out.println("*************************************************");
        System.out.println("Employee Details");
        System.out.println("Employee Name   : " + this.getName());
        System.out.println("Employee ID     : " + this.getEid());
        System.out.println();
        System.out.println("Account Details");
        System.out.println("Account Holder  : " + account.getAccName());
        System.out.println("Account No      : " + account.getAccNo());
        System.out.println("Account Bank    : " + account.getBank());
        System.out.println("Account Branch  : " + account.getBranch());
        System.out.println("Account Balance : " + account.getBalance());
        System.out.println("*************************************************");
    }
}
