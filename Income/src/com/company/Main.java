package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double income;
        double tax;

        System.out.print("Please enter your income: ");
        income = input.nextDouble();
        input.close();
        tax = 0;
        if (income < 1) {
            System.out.println("Income must be greater than 0");
            return;
        }
        else if (income <= 50000) {
            tax = income * 0.01;
        }
        else if (income <= 75000) {
            tax = income * 0.02;
        }
        else if (income <= 100000) {
            tax = income * 0.02;
        }
        else if (income <= 250000) {
            tax = income * 0.04;
        }
        else if (income <= 500000) {
            tax = income * 0.05;
        }
        else {
            tax = income * 0.06;
        }
        System.out.println("Your tax is: " + tax);
    }
}