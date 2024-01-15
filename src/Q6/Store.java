package Q6;

public class Store {
    public static void main(String[] args) {

        //Will create a customer and print their information
        Customer customer = new Customer("John Applewood", "2221 Applewood Drive", 6047042317L, false, 388271);
        System.out.println("Customer name: " + customer.getName());
        System.out.println("Customer number: #" + customer.getCustomerNumber());
        System.out.println("Customer address: " + customer.getAddress());
        System.out.println("Mail customer: " + customer.isOnMailingList());
        System.out.println("Customer phone number: " + customer.getTelephoneNumber());

    }
}
