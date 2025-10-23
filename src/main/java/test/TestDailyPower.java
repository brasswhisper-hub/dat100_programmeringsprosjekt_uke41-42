package test;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class TestDailyPower {

    public static void TestPrintPowerPrices(double[] prices)
    {DailyPower.printPowerPrices(prices);}

    public static void TestPrintPowerUsage(double[] usage)
    {DailyPower.printPowerUsage(usage);}

    public static Boolean[] TestAllNoneVoid(
        double[] usage,
        double[] prices,
        double powerUsage,
        double spotPrice,
        double powerSupport,
        double norgesPrice,
        double peakUsage,
        double avgPower,
        double avgPrice
    ){
        Boolean[] ans = new Boolean[7];
        
        ans[0] = TestComputePowerUsage(usage, powerUsage);
        ans[1] = TestComputeSpotPrice(usage, prices, spotPrice);
        ans[2] = TestComputePowerSupport(usage, prices, powerSupport);
        ans[3] = TestComputeNorgesPrice(usage, norgesPrice);
        ans[4] = TestFindPeakUsage(usage, peakUsage);
        ans[5] = TestFindAvgPower(usage, avgPower);
        ans[6] = TestAvgPrice(prices, avgPrice);

        return ans;
    }

    public static boolean TestComputePowerUsage(double[] usage, double powerUsage)
    {return powerUsage == DailyPower.computePowerUsage(usage);}

    public static boolean TestComputeSpotPrice(double[] usage, double[] prices, double spotPrice)
    {return spotPrice == DailyPower.computeSpotPrice(usage, prices);}

    public static boolean TestComputePowerSupport(double[] usage, double[] prices, double powerSupport)
    {return powerSupport == DailyPower.computePowerSupport(usage, prices);}

    public static boolean TestComputeNorgesPrice(double[] usage, double norgesPrice)
    {return norgesPrice == DailyPower.computeNorgesPrice(usage);}

    public static boolean TestFindPeakUsage(double[] usage, double peakUsage)
    {return peakUsage == DailyPower.findPeakUsage(usage);}

    public static boolean TestFindAvgPower(double[] usage, double avgPower)
    {return avgPower == DailyPower.findAvgPower(usage);}

    public static boolean TestAvgPrice(double[] dayPrices, double avgPrice)
    {return avgPrice == DailyPower.AvgPrice(dayPrices);}
}