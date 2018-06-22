package io.github.maxin.j2se.codewars;

public class Money {
    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        // your code
        double result=principal;
        int year=0;

        while (result<desired) {
            result=result+result*interest-result*interest*tax;
            year++;
        }

        return year;
    }

    public static void main(String[] args) {
        System.out.println(Money.calculateYears(1000,0.05,0.18,1100));
    }
}
