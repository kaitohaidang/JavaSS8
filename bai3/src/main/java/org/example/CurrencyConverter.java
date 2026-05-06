package org.example;

public class CurrencyConverter {
    private static double rate;

    public static void setRate(double r) {
        if (r > 0) {
            rate = r;
        } else {
            System.out.println("Tỉ giá không hợp lệ!");
        }
    }

    public static double getRate() {
        return rate;
    }

    public static double toUSD(int vnd) {
        return vnd / rate;
    }

    public static double formatUSD(double usd) {
        return Math.round(usd * 100.0) / 100.0;
    }
}
