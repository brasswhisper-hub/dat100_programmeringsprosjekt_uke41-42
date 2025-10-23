package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class Customers {

    private Customer[] customers;

    // a) Complete constructor
    public Customers(int size) {
        this.customers = new Customer[size];
    }

    // b) count number of non-null references
    public int countNonNull() {
        
        int count = 0;

        for (int i = 0; i <= customers.length; i++) {
            if (customers[i] != null) {
                count += 1;
            }
        }

        return count;
    }

    // c) return reference to customer with given id (if exists)
    public Customer getCustomer(int customer_id) {
        for (Customer customer : customers) {
            if (customer.getCustomer_id() == customer_id) {
                return customer;
            }
        }

        return new Customer(customer_id);
    }

    // d) add a customer to the reference table
    public boolean addCustomer(Customer c) {
        try {
            customers[customers.length] = c;            
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    // e) remove customer with given id from reference table
    public Customer removeCustomer(int customer_id) {
        
        // offloading  the customers list to cs
        Customer[] cs = customers;
        customers = new Customer[cs.length];
        
        Customer c = null;

        int i = 0;
        for (Customer customer : customers) {
            if (customer.getCustomer_id() == customer_id) {
                c = customer;
            }
            else {
                customers[i++] = customer;
            }
        }
        
        return c;
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {
        /* isn't this just the "getter" part of a
         * "get" "set" pair for a private variable?
        */
        return customers;
    }
}