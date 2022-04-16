package class_and_projects;

import java.util.Date;
import java.util.Scanner;

public class Loan {
    private double annual;
    private double years;
    private double loan;
    private java.util.Date loanDate;
    Scanner sc = new Scanner(System.in);

    public void setAnnual(double annual) {
        this.annual = annual;
    }

    public double getAnnual() {
        return annual;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public double getLoan() {
        return loan;
    }

    public void setYears(double years) {
        this.years = years;
    }

    public double getYears() {
        return years;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    //Getting the monthly payment
    public double getMonthlyPayment() {
        double monthlyInterest = annual / 1200;
        double monthlyPay = loan * monthlyInterest / (1 - (Math.pow(1 + monthlyInterest, years * 12)));
        return monthlyPay;
    }

    //    Finding total payment
    public double getTotalPay() {
        double totalPay = getMonthlyPayment() * years * 12;
        return totalPay;
    }

    void input() {
        System.out.println("Enter your Annual Interest Rate\n");
        double annual = sc.nextDouble();
        System.out.println("Enter the number of Years\n");
        double years = sc.nextDouble();
        System.out.println("Enter the Loan amount\n");
        double loan = sc.nextDouble();
        System.out.println("The loan was created on " + loanDate.toString() + "\n" + "The Monthly Payment is "
                + getMonthlyPayment() + "\n" + "The total Payment is " + getTotalPay() + "\n");
    }
    void display(){
        System.out.println("The loan was created on " + loanDate.toString() + "\n" + "The Monthly Payment is "
                + getMonthlyPayment() + "\n" + "The total Payment is " + getTotalPay() + "\n");
    }
}
