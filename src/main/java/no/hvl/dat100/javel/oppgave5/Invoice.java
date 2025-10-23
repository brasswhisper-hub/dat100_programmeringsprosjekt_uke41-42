package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class Invoice {

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] prices; // power prices for this month

    private double amount = 0; // power price for this month


    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {

        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = power_prices;
        computeAmount();
    }

    public void computeAmount() {
        
        switch (c.getAgreement()) {
            case NORGESPRICE:
                this.amount = MonthlyPower.computeNorgesPrice(this.usage);
                break;
            case POWERSUPPORT:
                this.amount = MonthlyPower.computePowerSupport(this.usage, this.prices);
                break;
            case SPOTPRICE:
                this.amount = MonthlyPower.computeSpotPrice(this.usage, this.prices);
                break;
            default:
                this.amount = MonthlyPower.computeSpotPrice(this.usage, this.prices);
        }
    }

    @Override
    public String toString(){
        return "Customer: " + this.c
            + "\nMonth: " + this.month
            + "\nPower usage: " + MonthlyPower.computePowerUsage(this.usage)
            + "\nAverage price: " + MonthlyPower.AvgPrice(this.prices)
            + "\nTotal amount: " + this.amount;
    }

    public void printInvoice() {
        System.out.print(this.toString());
    }
}
