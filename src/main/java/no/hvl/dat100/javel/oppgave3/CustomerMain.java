package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        Customer c1 = new Customer("ola nordmann","ola.nordm@ann.no",202,PowerAgreementType.NORGESPRICE);
        c1.setName("Ola Nordmann");
        c1.setEmail("Ola.Nordm@nn.no");
        c1.setCustomer_id(404);
        c1.setAgreement(PowerAgreementType.NORGESPRICE);
        c1.getName();
        c1.getEmail();
        c1.getCustomer_id();
        c1.getAgreement();
        c1.toString();

         //Write code that creates a Customer object and teste the methods implemented in the class
    }
}
