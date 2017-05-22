package com.company;
import java.util.Scanner;
/**
 * Created by HJ on 2017/5/22.
 * this program demonstrates a <code>while<code/>loop.
 * hello,I'm back.
 */
class Retirement {
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("How much money will you contribute every year?");
        double payment=in.nextDouble();
        System.out.print("Interest rate in %:");
        double interestRate=in.nextDouble();
        double balance=0;
        int year=0;

        String input;
        //update account balance while user isn't ready to retire
        do {
            //add this year's payment and interest
            balance+=payment;
            double interest=balance*interestRate/100;
            balance+=interest;
            year++;
            //print current balance
            System.out.printf("After year%d,your balance is %,.2f%n",year,balance);
            //ask if ready to retire and get input
            System.out.print("ready to retire?(Y/N）");
            input =in.next();
        }
        while(input.equals("N"));


    }
}
