package Q6;

public class Customer extends Person{
    private int customerNumber;
    private boolean onMailingList;


    //Getters & setters
    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isOnMailingList() {
        return onMailingList;
    }

    public void setOnMailingList(boolean onMailingList) {
        this.onMailingList = onMailingList;
    }

    //Constructor to set instance variables
    public Customer(String name, String address, long telephoneNumber, boolean onMailingList, int customerNumber) {
        super(name, address, telephoneNumber);
        this.customerNumber = customerNumber;
        this.onMailingList = onMailingList;
    }
}
