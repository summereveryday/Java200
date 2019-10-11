package HW;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat centsFormat = new DecimalFormat("#.00");

        Account myAccount = new Account(1122, 20000);
        myAccount.setAnnualInterestRate(4.5);
        myAccount.withdraw(2500);
        myAccount.deposit(3000);
        System.out.println("balance: $" + centsFormat.format(myAccount.getBalance()));
        System.out.println("monthly interest: $" + centsFormat.format(myAccount.getMonthlyInterest()));
        System.out.println("date created: " + myAccount.getDateCreated());
    }
}
