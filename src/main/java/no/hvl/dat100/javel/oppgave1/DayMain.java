package no.hvl.dat100.javel.oppgave1;

import test.TestDailyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        TestDailyPower.TestPrintPowerPrices(powerprices_day);
        TestDailyPower.TestPrintPowerUsage(powerusage_day);

        double powerUsage = 0;
        double spotPrice = 0;
        double powerSupport = 0;
        double norgesPrice = 0;
        double peakUsage = 0;
        double avgPower = 0;
        double avgPrice = 0;


        TestDailyPower.TestAllNoneVoid(powerusage_day, powerprices_day, powerUsage, spotPrice, powerSupport, norgesPrice, peakUsage, avgPower, avgPrice);
    }
}
