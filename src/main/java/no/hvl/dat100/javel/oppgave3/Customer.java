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
    public Customer(int customer_id) {
        this.name="null";
        this.email="null";
        this.customer_id=customer_id;
        this.agreement=PowerAgreementType.SPOTPRICE;
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

    @Override
    public String toString() {
        return "Customer number: "+customer_id+"\nname: "+name+"\nemail: "+email+"\nagreement: "+agreement;
    }
    
    // Tester metoder i CustomerMain
    }
}
