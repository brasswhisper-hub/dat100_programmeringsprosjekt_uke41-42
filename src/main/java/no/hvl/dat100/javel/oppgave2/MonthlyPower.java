package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {
        for (double[] _use : usage) {
            DailyPower.printPowerUsage(_use);
        }
    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {
        for (double[] _prices : prices) {
            DailyPower.printPowerPrices(_prices);
        }
    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {
        double sum = 0;

        for (double[] _use : usage) {
            sum += DailyPower.computePowerUsage(_use);
        }

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {
        return computePowerUsage(powerusage) > threshold;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {
        double sum = 0;

        for (int i = 0; i < usage.length; i++) {
            sum += DailyPower.computeSpotPrice(usage[i],prices[i]);
        }

        return sum;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {
        double sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += DailyPower.computePowerSupport(usage[i], prices[i]);
        }

        return sum;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {
        double sum = 0;
        
        for (double[] _use : usage) {
            sum += DailyPower.computeNorgesPrice(_use);
        }

        return sum;
    }
}
