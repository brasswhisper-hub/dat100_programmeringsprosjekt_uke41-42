package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {
        for (double[] usage1 : usage) {
            for (double _usage1 : usage1) {
                System.out.printf("%.2f kWh ", _usage1);
            }
        }
    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {
        for (double[] _prices : prices) {
            for (double price : _prices) {
                System.out.printf("%.2f kWh ", price);
            }
        }
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
        return computePowerUsage(powerusage) > threshold;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {
        double sum = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                sum += usage[i][j] * prices[i][j];
            }
        }
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {
        double sum = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (usage[i][j] * prices[i][j] ) {
                    
                }
                sum += usage[i][j] * prices[i][j];
            }
        }

        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;

        // TODO

        return price;
    }
}
