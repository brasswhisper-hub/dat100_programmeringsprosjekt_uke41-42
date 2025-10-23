package no.hvl.dat100.javel.oppgave1;

import jdk.jfr.Percentage;
import jdk.jfr.Threshold;

public class DailyPower {

    // a) print power prices during a day
    public static void printPowerPrices(double[] prices) {
        for (int i=0; i<prices.length;i++) {
            System.out.printf("%.2f kWh ",prices[i]);
        }
    }

    // b) print power usage during a day
    public static void printPowerUsage(double[] usage) {

        for (int i=0; i<usage.length;i++) {
            System.out.printf("\n%.2f NOK ", usage[i]);
        }

    }

    // c) compute power usage for a single day
    public static double computePowerUsage(double[] usage) {

        double sum = 0;
        for (int i=0; i<usage.length; i++) {
            sum+=usage[i];
        }
        return sum;
    }

    // d) compute spot price for a single day
    public static double computeSpotPrice(double[] usage, double[] prices) {

        double price = 0;

        for (int i=0; i<usage.length;i++) {
            for (int z=0; z<prices.length;z++) {
                price=usage[i]*prices[z];
            }
        }

        return price;
    }

    // e) compute power support for a given usage and price
    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;

    private static double getSupport(double usage, double price) {
        if (usage*price < THRESHOLD) { return 0.0; }

        return (usage*price - THRESHOLD) * PERCENTAGE;
    }

    // f) compute power support for a single day
    public static double computePowerSupport(double[] usage, double[] prices) {
        double sum = 0;
        
        for(int i = 0; i < usage.length; i++){
            sum += getSupport(usage[i], prices[i]);
        }
        
        return sum;
    }

    private static final double NORGESPRIS_KWH = 0.5;

    // g) compute norges pris for a single day
    public static double computeNorgesPrice(double[] usage) {
        double sum = 0;

        for(double _use : usage){
            sum += _use * NORGESPRIS_KWH;
        }

        return sum;
    }

    // g) compute peak usage during a single day
    public static double findPeakUsage(double[] usage) {
        double max = 0;
        for(double _use : usage) {
            if ( max < _use) {
                max = _use;
            }
        }

        return max;
    }

    public static double findAvgPower(double[] usage) {
        double sum = 0;

        for(double _use : usage){
            sum += _use;
        }

        return sum / usage.length;
    }
}