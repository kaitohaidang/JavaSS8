package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CurrencyConverter.setRate(25000);

        int vnd = 1000000;

        double usd = CurrencyConverter.toUSD(vnd);

        System.out.println("USD raw: " + usd);
        System.out.println("USD formatted: " + CurrencyConverter.formatUSD(usd));
    }
}