package HW;

import org.omg.PortableServer.POAPackage.ObjectAlreadyActive;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    Account(){
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = null;
    }

    Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate(){
        //do math;
        double monthlyInterestRate = 0;
        return monthlyInterestRate;
    }

    public double getMonthlyInterest(){
        //do math;
        double monthlyInterest = 0;
        return monthlyInterest;
    }

    public void withdraw(int amount){
        balance -= amount;
    }

    public void deposit(int amount){
        balance += amount;
    }
}
