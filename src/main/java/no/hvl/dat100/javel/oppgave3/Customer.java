package no.hvl.dat100.javel.oppgave3;

public class Customer {
    private String name;
    private String email;
    private int customer_id;
    private PowerAgreementType agreement;

    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {
        this.name=name;
        this.email=email;
        this.customer_id=customer_id;
        this.agreement=agreement;
    }
// get/set metoder
    public void setName(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setEmail(String email) {
        this.email=email;
    }
    public String getEmail() {
        return email;
    }
    public void setCustomer_id(int customer_id) {
        this.customer_id=customer_id;
    }
    public int getCustomer_id() {
        return customer_id;
    }
    public void setAgreement(PowerAgreementType agreement) {
        this.agreement=agreement;
    }
    public PowerAgreementType getAgreement() {
        return agreement;
    }
    public String toString() {
        return "Customer number "+customer_id+"\n name "+name+"\n email "+email+"\n agreement "+agreement;
    }
    // tester metoder
    public static void main(String[] args) {
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
    }
}
