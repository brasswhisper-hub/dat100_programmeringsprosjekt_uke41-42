package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {
        for (int i=0; i<usage.length;i++) {
            for (int z=0; z<usage[i].length;z++)
            System.out.printf("%.2f kWh ",usage[i][z]);
        }

    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {
        for (int i=0; i<prices.length;i++) {
            for (int z=0; z<prices[i].length;z++)
                System.out.printf("%.2f kWh ",prices[i][z]);
    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        for (int i=0; i<usage.length;i++) {
            for (int z=0; z<usage[i].length;z++)
                sum+=usage[i][z];
        }

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;
        while (usage<=threshold &&!exceeded) {
            for (int i=0; i<powerusage;i++) {
                for (int z = 0; z < powerusage[i]; z++) {
                    if (powerusage[i][z] >= threshold) {
                        exceeded=true;
                    } else {
                        exceeded=false;
                    }
                    }
                }
            }
        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        // TODO

        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;

        // TODO

        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;

        // TODO

        return price;
    }
}
